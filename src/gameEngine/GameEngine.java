package gameEngine;

import javax.swing.*;

public class GameEngine extends JFrame implements Runnable {
    public KL keyListener = new KL();
    public Draw drawModule;
    public Pixels pixels = new Pixels();
    public int width,height;
    public int count=0;
    public GameEngine(){
        this.width = Constants.SCREEN_WIDTH;
        this.height = Constants.SCREEN_HEIGHT;


        this.setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        this.setTitle(Constants.SCREEN_TITLE);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(keyListener);

        this.drawModule = new Draw(this);
        this.setVisible(true);
    }


    private void update(double dt){

//        System.out.println(dt);
        drawModule.drawPixels(this.pixels);

        drawModule.drawRect(this.pixels,10,10,10,10,'#');
//        drawModule.drawTriangle();

    }

    public void run() {
        double lastFrameTime = 0.0;
        while(true){
            double time = Time.getTime();
            double deltaTime = time - lastFrameTime;
            lastFrameTime = time;
            update(deltaTime);

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
