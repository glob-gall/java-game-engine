package gameEngine;

import Pong.KL;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.awt.event.KeyEvent;

public class Control {
    public Rect rect;
    public KL keyListener;
    public int keyDown;
    public int keyUp;
    public int keyRight;
    public int KeyLeft;
    Control(Rect rect, KL keyListener, KeyEvent keyDown, KeyEvent keyUp, KeyEvent keyRight, KeyEvent KeyLeft){
        this.rect = rect;
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
            }else if (keyListener.isKeyPressed(this.KeyLeft)){
                this.moveLeft(dt);
            }
        }
    }
    public void moveUp(double dt){

    }
    public void moveDown(double dt){

    }
    public void moveRight(double dt){

    }
    public void moveLeft(double dt){

    }

}
