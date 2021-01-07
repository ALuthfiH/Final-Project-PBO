package id.ac.its.alfarabi0039.ridho170.luthfi179.fp_flappybird;

import java.awt.Rectangle;

import javax.swing.ImageIcon;

import java.awt.Graphics;
import java.awt.Image;

public abstract class GameObject {
	protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected float velX;
    protected float velY;
    protected Image image;
    
    public GameObject(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public abstract void tick();
    
    public abstract void render(final Graphics p0);
    
    protected void loadImage(String imageName) {
    	ImageIcon ii = new ImageIcon(getClass().getResource(imageName));
        image = ii.getImage();
    }
    
    public Rectangle getBounds() {
        return new Rectangle(this.x, this.y, this.width, this.height);
    }
    
    public int getX() {
        return this.x;
    }
    
    public void setX(final int x) {
        this.x = x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setY(final int y) {
        this.y = y;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public void setWidth(final int width) {
        this.width = width;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public void setHeight(final int height) {
        this.height = height;
    }
    
    public float getVelX() {
        return this.velX;
    }
    
    public void setVelX(final float velX) {
        this.velX = velX;
    }
    
    public float getVelY() {
        return this.velY;
    }
    
    public void setVelY(final float velY) {
        this.velY = velY;
    }
}
