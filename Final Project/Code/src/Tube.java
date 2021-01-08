package id.ac.its.alfarabi0039.ridho170.luthfi179.fp_flappybird;

import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tube extends GameObject {
	TubeType type;
    BufferedImage tubeBlock;
    BufferedImage tube;
    
    public Tube(final int x, final int y, final int width, final int height, final TubeType type) {
        super(x, y, width, height);
        this.type = type;
        this.velX = 3.0f;
        this.tube = GraphicsLoader.loadGraphics("tube.png");
        if (type == TubeType.BOTTOM) {
            this.tubeBlock = GraphicsLoader.loadGraphics("tubebottomdown.png");
        }
        else if (type == TubeType.TOP) {
            this.tubeBlock = GraphicsLoader.loadGraphics("tubebottomtop.png");
        }
    }
    
    @Override
    public void tick() {
        this.x -= (int)this.velX;
        if (this.x + this.width < 0) {
            ObjectHandler.removeObject((GameObject)this);
            if (this.type == TubeType.TOP) {
                ++Game.score;
            }
        }
    }
    
    @Override
    public void render(final Graphics g) {
        if (this.type == TubeType.BOTTOM) {
            g.drawImage(this.tube, this.x, this.y, 72, this.height, null);
            g.drawImage(this.tubeBlock, this.x - 3, this.y, null);
        }
        else if (this.type == TubeType.TOP) {
            g.drawImage(this.tube, this.x, this.y, 72, this.height, null);
            g.drawImage(this.tubeBlock, this.x - 3, this.y + this.height - 36, null);
        }
    }
}
