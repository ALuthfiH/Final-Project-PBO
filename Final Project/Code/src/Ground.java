package id.ac.its.alfarabi039_ridho170_luthfi179.fp_flappybird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Ground extends GameObject {
	private BufferedImage image;
    private int x2;
    private float velX;
    
    public Ground(final int x, final int y, final int width, final int height) {
    	super(x, y, width, height);
        this.x2 = Game.WIDTH;
        this.velX = 4.0f;
        this.image = GraphicsLoader.loadGraphics("ground.png");
    }
    
    @Override
    public void tick() {
        this.x -= (int)this.velX;
        this.x2 -= (int)this.velX;
        if (this.x + Game.WIDTH < 0) {
            this.x = Game.WIDTH;
        }
        if (this.x2 + Game.WIDTH < 0) {
            this.x2 = Game.WIDTH;
        }
    }
    
    public void render(final Graphics g) {
        g.drawImage(this.image, this.x, this.y, null);
        g.drawImage(this.image, this.x2, this.y, null);
    }
}
