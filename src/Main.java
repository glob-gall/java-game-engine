import gameEngine.*;

import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args){
//        Pong.Window window = new Pong.Window();
//        Thread t1 = new Thread(window);
//        t1.start();

        Rect objeto1 = new Rect(10,5,20,10,'#');
        Control controlRect1 = new  Control(objeto1, KeyEvent.VK_DOWN,KeyEvent.VK_UP,KeyEvent.VK_RIGHT,KeyEvent.VK_LEFT,true);

        Rect objeto2 = new Rect(5,5,5,5,'@');
        Control controlRect2 = new  Control(objeto2, KeyEvent.VK_S,KeyEvent.VK_W,KeyEvent.VK_D,KeyEvent.VK_A,true);

        Triangle objeto3 = new Triangle(20, 30, 4, '&');
        Triangle objeto4 = new Triangle(25,27 , 4 , '*');
        Control controlTriangle = new Control(objeto3, KeyEvent.VK_PAGE_DOWN, KeyEvent.VK_PAGE_UP, KeyEvent.VK_J, KeyEvent.VK_G, true);

        Circle objeto5 = new Circle(8, 17, 2, '&');
        Circle objeto6 = new Circle(23, 30, 1, '%');

        Control[] controllers = new Control[3];
        controllers[0] = controlRect1;
        controllers[1] = controlRect2;
        controllers[2] = controlTriangle;

        Circle[] circles = new Circle[2];
        circles[0] = objeto5;
        circles[1] = objeto6;

        Rect[] rects = new Rect[2];
        rects[0] = objeto1;
        rects[1] = objeto2;

        Triangle[] triangles = new Triangle[2];
        triangles[0] = objeto3;
        triangles[1] = objeto4;


        GameEngine gm = new GameEngine(controllers,rects, triangles, circles);
        Thread t1 = new Thread(gm);
        t1.start();
    }
}