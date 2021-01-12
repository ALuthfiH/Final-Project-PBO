package id.ac.its.alfarabi0039.ridho170.luthfi179.fp_flappybird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Ground extends GameObject {
	private BufferedImage image;
    private int x2;
    private float velX;
    
    public Ground() {
    	super(0);
        this.x2 = 432;
        this.velX = 4.0f;
        this.image = GraphicsLoader.loadGraphics("ground.png");
    }
    
    @Override
    public void tick() {
        this.x -= (int)this.velX;
        this.x2 -= (int)this.velX;
        if (this.x + 432 < 0) {
            this.x = 432;
        }
        if (this.x2 + 432 < 0) {
            this.x2 = 432;
        }
    }
    
    public void render(final Graphics g) {
        g.drawImage(this.image, this.x, 600, null);
        g.drawImage(this.image, this.x2, 600, null);
    }
}
