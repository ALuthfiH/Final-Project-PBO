package id.ac.its.alfarabi0039.ridho170.luthfi179.fp_flappybird;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class KeyHandler implements KeyListener {
	@Override
    public void keyTyped(final KeyEvent e) {
    }
    
    @Override
    public void keyPressed(final KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            Game.bird.setVelY(-5.0f);
        }
    }
    
    @Override
    public void keyReleased(final KeyEvent e) {
    }
}
