package id.ac.its.alfarabi0039.ridho170.luthfi179.collisiondetectmouse;

public class Alien extends Sprite {

	private final int INITIAL_X = 400;
	
	public Alien(int x, int y) {
		super(x, y);

		initAlien();
	}
	
    private void initAlien() {

        loadImage("alien.png");
        getImageDimensions();
    }

    public void move() {

        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}
