import gameEngine.Constants;
import gameEngine.GameEngine;

public class Main {
    public static void main(String[] args){
//        Window window = new Window();
//        Thread t1 = new Thread(window);
//        t1.start();

        Constants values = new Constants(800,600,"Pong");
        GameEngine gm = new GameEngine(values);
        Thread t1 = new Thread(gm);
        t1.start();
    }
}
