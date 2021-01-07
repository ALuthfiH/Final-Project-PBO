package id.ac.its.alfarabi0039.ridho170.luthfi179.fp_flappybird;

import java.awt.Graphics;
import java.util.LinkedList;

public class ObjectHandler {
	public static LinkedList<GameObject> list;
    
    static {
        ObjectHandler.list = new LinkedList<GameObject>();
    }
    
    public static void addObject(final GameObject o) {
        ObjectHandler.list.add(o);
    }
    
    public static void removeObject(final GameObject o) {
        ObjectHandler.list.remove(o);
    }
    
    public static void render(final Graphics g) {
        GameObject temp = null;
        for (int i = 0; i < ObjectHandler.list.size(); ++i) {
            temp = ObjectHandler.list.get(i);
            temp.render(g);
        }
    }
    
    public static void tick() {
        GameObject temp = null;
        for (int i = 0; i < ObjectHandler.list.size(); ++i) {
            temp = ObjectHandler.list.get(i);
            temp.tick();
        }
    }
}
