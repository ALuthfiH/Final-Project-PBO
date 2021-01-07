package id.ac.its.alfarabi039_ridho170_luthfi179.fp_flappybird;

import java.awt.Image;
import java.io.InputStream;

import javax.swing.ImageIcon;

public class ResourceLoader {
	protected Image image;

		public static InputStream load(final String path) {
        InputStream input = ResourceLoader.class.getResourceAsStream(path);
        if (input == null) {
            input = ResourceLoader.class.getResourceAsStream(path);
        }
        return input;
    }
}
