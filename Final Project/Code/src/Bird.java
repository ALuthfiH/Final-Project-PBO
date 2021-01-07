package id.ac.its.alfarabi039_ridho170_luthfi179.fp_flappybird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;


public class Bird extends GameObject {
	Animation animation;
	BufferedImage bird;
    public float gravity;
    public float maxSpeed;
    
    public Bird(final int x, final int y, final int width, final int height) {
        super(x, y, width, height);
        this.gravity = 0.3f;
        this.maxSpeed = 12.0f;
        final BufferedImage[] images = new BufferedImage[3];
        for (int i = 0; i < images.length; ++i) {
            images[i] = GraphicsLoader.loadGraphics("bird" + i + ".png");
        }
        (this.animation = new Animation((GameObject)this, 100L, true, images)).start();
        ObjectHandler.addObject((GameObject)this);
    }
    
    public void tick() {
        this.velY += this.gravity;
        this.y += (int)this.velY;
        if (this.velY > this.maxSpeed) {
            this.velY = this.maxSpeed;
        }
        if (this.y + this.height > 602) {
            this.y = 602 - this.height;
            this.setVelY(0.0f);
        }
        if (this.y < 0) {
            this.y = 0;
            this.setVelY(0.0f);
        }
        GameObject temp = null;
        for (int i = 0; i < ObjectHandler.list.size(); ++i) {
            temp = ObjectHandler.list.get(i);
            if (temp instanceof Tube && this.getBounds().intersects(temp.getBounds())) {
                Game.gameover = true;
            }
        }
        this.animation.tick();
    }
    
    @Override
    public void render(final Graphics g) {
        this.animation.render(g);
//    	g.drawImage(this.bird, this.x, this.y, this.width, this.height, null);
//    	g.drawImage(this.bird, this.x, this.y, this.width, this.height, null);
    }
}
