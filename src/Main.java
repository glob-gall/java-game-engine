import gameEngine.Constants;
import gameEngine.Control;
import gameEngine.GameEngine;
import gameEngine.Rect;

import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args){
//        Pong.Window window = new Pong.Window();
//        Thread t1 = new Thread(window);
//        t1.start();

        Rect objeto1 = new Rect(10,10,10,10,'#');
        Control controlRect1 = new  Control(objeto1, KeyEvent.VK_DOWN,KeyEvent.VK_UP,KeyEvent.VK_RIGHT,KeyEvent.VK_LEFT);

        Rect objeto2 = new Rect(20,20,5,5,'@');
        Control controlRect2 = new  Control(objeto2, KeyEvent.VK_S,KeyEvent.VK_W,KeyEvent.VK_D,KeyEvent.VK_A);

        Control[] controllers = new Control[2];
        controllers[0] = controlRect1;
        controllers[1] = controlRect2;

        Rect[] rects = new Rect[2];
        rects[0] = objeto1;
        rects[1] = objeto2;




        GameEngine gm = new GameEngine(controllers,rects);
        Thread t1 = new Thread(gm);
        t1.start();
    }
}
