package id.ac.its.alfarabi0039.ridho170.luthfi179.fp_flappybird;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener {
    @Override
    public void mouseClicked(final MouseEvent e) {
	if (!Game.gameover)
	    Game.bird.setVelY(-5.0f);
    }
    
    @Override
    public void mousePressed(final MouseEvent e) {
        if (Button.checkCollision(e.getX(), e.getY(), Game.startButton) && Game.gameover) {
            Game.startButton.pressed = true;
            ObjectHandler.list.clear();
	    Game.bird.setY(50);
            ObjectHandler.addObject((GameObject)Game.bird);
            Game.gameover = false;
            Game.score = 0;
            Game.startButton.pressed = false;
        }
    }  
    
    @Override
    public void mouseReleased(final MouseEvent e) {
    }
    
    @Override
    public void mouseEntered(final MouseEvent e) {
    }
    
    @Override
    public void mouseExited(final MouseEvent e) {
    }
}
