package id.ac.its.alfarabi0039.ridho170.luthfi179.fp_flappybird;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.net.ServerSocket;

import javax.swing.ImageIcon;

import java.awt.event.MouseListener;
import java.awt.event.KeyListener;


public class Game extends Canvas implements Runnable
{
    public static final int WIDTH = 432;
    public static final int HEIGHT = 768;
    public boolean running;
    public static boolean gameover;
    public static BufferedImage img_gameover;
    public static BufferedImage background;
    public static Ground ground;
    public static Bird bird;
    public static Button startButton;
    public static int score;
    Thread thread;
    ServerSocket serverSocket;
    
    public static void main(final String[] args) {
        new Window(432, 768, "FlappyBird", new Game());
    }
    
    public synchronized void start() {
        this.running = true;
        (this.thread = new Thread()).start();
        this.run();
    }
    
    public void init() {
        this.addKeyListener((KeyListener)new KeyHandler());
        this.addMouseListener((MouseListener)new MouseHandler());
        Game.img_gameover = GraphicsLoader.loadGraphics("gameover.png");
        Game.background = GraphicsLoader.loadGraphics("background.png");
        Game.ground = new Ground();
        Game.bird = new Bird(50, 50, 51, 36);
        Game.startButton = new Button(138, 200, 156, 87, GraphicsLoader.loadGraphics("playbutton.png"));
    }
    
    public void tick() {
        if (!Game.gameover) {
            ObjectHandler.tick();
            Game.ground.tick();
        }
    }
    
    public void render() {
        final BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }
        final Graphics g = bs.getDrawGraphics();
        g.drawImage(Game.background, 0, 0, null);
        Game.ground.render(g);
        ObjectHandler.render(g);
        if (Game.gameover) {
            g.drawImage(Game.img_gameover, 72, 130, null);
            Game.startButton.render(g);
        }
        g.setFont(new Font("Arial", 1, 48));
        g.setColor(Color.WHITE);
        final String s = Integer.toString(Game.score);
        final int textWidth = g.getFontMetrics().stringWidth(s);
        g.drawString(s, 216 - textWidth / 2, 40);
        g.dispose();
        bs.show();
    }
    
    @Override
    public void run() {
        this.init();
        this.requestFocus();
        long pastTime = System.nanoTime();
        final double amountOfTicks = 60.0;
        final double ns = 1.0E9 / amountOfTicks;
        double delta = 0.0;
        long timer = System.currentTimeMillis();
        int updates = 0;
        int frames = 0;
        while (this.running) {
            final long now = System.nanoTime();
            delta += (now - pastTime) / ns;
            pastTime = now;
            while (delta > 0.0) {
                this.tick();
                ++updates;
                this.render();
                ++frames;
                --delta;
            }
            if (System.currentTimeMillis() - timer > 1000L) {
                timer += 1000L;
                System.out.println("FPS: " + frames + " | TICKS: " + updates);
                TubeHandler.tick();
                updates = 0;
                frames = 0;
            }
        }
    }
}
