package id.ac.its.alfarabi0039.ridho170.luthfi179.fp_flappybird;

import java.awt.Component;
import java.io.IOException;
import java.net.ServerSocket;
import javax.swing.JFrame;

public class Window extends JFrame {
	public Window(final int width, final int height, final String title, final Game game) {
        try {
            game.serverSocket = new ServerSocket(9999);
        }
        catch (IOException e) {
            System.out.println("Game already started!");
            System.exit(0);
        }
        this.setTitle(title);
        this.pack();
        this.setSize(width + this.getInsets().left + this.getInsets().right, height + this.getInsets().top + this.getInsets().bottom);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.add(game);
        game.start();
    }
}
