package id.ac.its.ridho170.shootingaliens;

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
