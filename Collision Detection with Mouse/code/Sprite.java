package id.ac.its.alfarabi0039.ridho170.luthfi179.collisiondetectmouse;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Sprite {
	
	 	protected int x;
	    protected int y;
	    protected int width;
	    protected int height;

		protected boolean visible;
	    protected Image image;

	    public Sprite(int x, int y) {

	        this.x = x;
	        this.y = y;
	        visible = true;
	    }

	    protected void getImageDimensions() {

	        width = image.getWidth(null);
	        height = image.getHeight(null);
	    }

	    protected void loadImage(String imageName) {

	        ImageIcon ii = new ImageIcon(getClass().getResource(imageName));
	        image = ii.getImage();
	    }

	    public Image getImage() {
	        return image;
	    }

	    public int getX() {
	        return x;
	    }

	    public int getY() {
	        return y;
	    }
	    
	    public int getWidth() {
			return width;
		}

		public int getHeight() {
			return height;
		}

	    public boolean isVisible() {
	        return visible;
	    }

	    public void setVisible(Boolean visible) {
	        this.visible = visible;
	    }

	    public Rectangle getBounds() {
	        return new Rectangle(x, y, width, height);
	    }

}
