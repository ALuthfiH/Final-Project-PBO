package id.ac.its.alfarabi0039.ridho170.luthfi179.collisiondetectmouse;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.MouseEvent;

public class SpaceShip extends Sprite{
	
    public SpaceShip(int x, int y) {
        super(x, y);

        initCraft();
    }
    
    private int dx;
    private int dy;
    private int MAX_X;
    private int MAX_Y;
    private List<Missile> missiles;

    private void initCraft() {
        
        missiles = new ArrayList<>();
        loadImage("spaceship.png");
        getImageDimensions();
        
        this.MAX_X = 400 - getWidth();
        this.MAX_Y = 300 - getHeight();
    }

    public void move() {

        x += dx;
        y += dy;

        if (x < 1) {
            x = 1;
        }

        if (y < 1) {
            y = 1;
        }
    }

    public List<Missile> getMissiles() {
        return missiles;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            fire();
        }
    }
    
    public void mouseClicked(MouseEvent event) {
    	fire();
    }
    
    public void mouseDragged(MouseEvent event) {
    	mouseMoved(event);
    }
    
    public void mouseMoved(MouseEvent event) {
    	
    	x = event.getX();
    	y = event.getY();
    	
    	if (x > MAX_X) {
            x = MAX_X; 
        }
    	
    	if (y > MAX_Y) {
            y = MAX_Y;
        }
    }

    public void fire() {
        missiles.add(new Missile(x + width, y + height / 2));
    }
}
