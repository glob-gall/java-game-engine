package gameEngine;


import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.awt.event.KeyEvent;

public class Control {
    public Rect rect;
    public KL keyListener;
    public int keyDown;
    public int keyUp;
    public int keyRight;
    public int keyLeft;
    public int KeyLeft;
    public Control(Rect rect, int keyDown, int keyUp, int keyRight, int keyLeft){
        this.rect = rect;

        this.keyDown = keyDown;
        this.keyUp = keyUp;
        this.keyRight = keyRight;
        this.keyLeft = keyLeft;
    }

    public void addEventListener(KL keyListener){
        this.keyListener = keyListener;
    }

    public void update(double dt){
        if(keyListener != null ){
            if(keyListener.isKeyPressed(this.keyDown)){ //KeyEvent.VK_DOWN
                this.moveDown(dt);
            }else if(keyListener.isKeyPressed(this.keyUp)){ //KeyEvent.VK_UP
                this.moveUp(dt);
            }else if (keyListener.isKeyPressed(this.keyRight)){
                this.moveRight(dt);
            }else if (keyListener.isKeyPressed(this.keyLeft)){
                this.moveLeft(dt);
            }
        }
    }
    public void moveUp(double dt){
        this.rect.y--;
        System.out.println("KEY UP PRESSED");
    }
    public void moveDown(double dt){
        this.rect.y++;
        System.out.println("KEY DOWN PRESSED");
    }
    public void moveRight(double dt){
        this.rect.x++;
    }
    public void moveLeft(double dt){
        System.out.println("MOVE LEFT");
        this.rect.x--;
    }
}
