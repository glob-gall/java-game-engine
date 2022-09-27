package gameEngine;

import javax.swing.*;

public class GameEngine extends JFrame implements Runnable {
    public KL keyListener = new KL();
    public Draw drawModule;
    public char[][] pixels;
    public int width,height;

    public GameEngine(Constants values){
        this.width = values.SCREEN_WIDTH;
        this.height = values.SCREEN_HEIGHT;


        this.setSize(values.SCREEN_WIDTH, values.SCREEN_HEIGHT);
        this.setTitle(values.SCREEN_TITLE);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(keyListener);

        this.pixels = new char[values.SCREEN_WIDTH][values.SCREEN_HEIGHT];

        this.drawModule = new Draw(this,values.SCREEN_WIDTH, values.SCREEN_HEIGHT);
        this.setVisible(true);
    }


    private void update(double dt){
        int teste = (int) dt/this.width;
        int middle = (int) (this.height/2);

        System.out.println(dt);
        drawModule.drawPixels(pixels);
        this.pixels[teste][middle] = '#';
    }

    public void run() {
        double lastFrameTime = 0.0;
        while(true){
            double time = Time.getTime();
            double deltaTime = time - lastFrameTime;
            lastFrameTime = time;

            update(deltaTime);

        }
    }
}
