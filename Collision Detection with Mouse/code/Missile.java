package id.ac.its.alfarabi0039.ridho170.luthfi179.collisiondetectmouse;

public class Missile extends Sprite {
	
	public Missile(int x, int y) {
		super(x, y);

		initMissile();
	}

	private final int BOARD_WIDTH = 390;
	private final int MISSILE_SPEED = 2;
	    
	private void initMissile() {
	        
		loadImage("missile.png");
	    getImageDimensions();        
	}

	public void move() {
	        
		x += MISSILE_SPEED;
	    if (x > BOARD_WIDTH)
	    	visible = false;
	}

}
