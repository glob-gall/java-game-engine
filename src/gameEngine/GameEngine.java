package gameEngine;

import javax.swing.*;

public class GameEngine extends JFrame implements Runnable {
    public KL keyListener = new KL();
    public Draw drawModule;
    public char[][] pixels;
    public int width,height;
    public int count=0;
    public GameEngine(Constants values){
        this.width = values.SCREEN_WIDTH;
        this.height = values.SCREEN_HEIGHT;


        this.setSize(values.SCREEN_WIDTH, values.SCREEN_HEIGHT);
        this.setTitle(values.SCREEN_TITLE);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(keyListener);

        char[][] pixels = new char[values.SCREEN_HEIGHT][values.SCREEN_WIDTH];

        for (int i = 0; i < values.SCREEN_HEIGHT; i++) {
            for (int j = 0; j < values.SCREEN_WIDTH; j++) {
                pixels[i][j]=' ';
            }
        }
        this.pixels = pixels;

        this.drawModule = new Draw(this,values.SCREEN_WIDTH, values.SCREEN_HEIGHT);
        this.setVisible(true);
    }


    private void update(double dt){
        int middle = 200;
        this.count++;
        if (count < this.height){
            this.pixels[this.count][middle] = '#';
        }
        System.out.println(dt);
        drawModule.drawPixels(pixels);

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
