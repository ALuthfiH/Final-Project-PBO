package id.ac.its.alfarabi039_ridho170_luthfi179.fp_flappybird;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class GraphicsLoader {
	public static BufferedImage loadGraphics(final String path) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(ResourceLoader.load("/" + path));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
