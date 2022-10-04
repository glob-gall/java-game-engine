package gameEngine;


import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.awt.event.KeyEvent;

public class Control {
    public Rect rect;
    public Triangle triangle;
    public Circle circle;
    public KL keyListener;
    public Collision collision;
    public int keyDown;
    public int keyUp;
    public int keyRight;
    public int keyLeft;
    public boolean hasCollision;

    public Control(Rect rect, int keyDown, int keyUp, int keyRight, int keyLeft, boolean hasCollision){
        this.rect = rect;
        this.triangle = null;
        this.circle = null;

        this.keyDown = keyDown;
        this.keyUp = keyUp;
        this.keyRight = keyRight;
        this.keyLeft = keyLeft;
        this.hasCollision = hasCollision;
    }

    public Control(Triangle triangle, int keyDown, int keyUp, int keyRight, int keyLeft, boolean hasCollision){
        this.triangle = triangle;
        this.circle = null;
        this.rect = null;

        this.keyDown = keyDown;
        this.keyUp = keyUp;
        this.keyRight = keyRight;
        this.keyLeft = keyLeft;
        this.hasCollision = hasCollision;
    }

    public Control(Circle circle, int keyDown, int keyUp, int keyRight, int keyLeft, boolean hasCollision){
        this.circle = circle;
        this.triangle = null;
        this.rect = null;

        this.keyDown = keyDown;
        this.keyUp = keyUp;
        this.keyRight = keyRight;
        this.keyLeft = keyLeft;
        this.hasCollision = hasCollision;
    }

    public void setCollision(Collision collision) {
        this.collision = collision;
        this.hasCollision = true;
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
        if (this.rect != null){
            if (!this.hasCollision || this.collision.canMoveUp(this.rect)){
                this.rect.y--;
            }
        }
        if (this.triangle != null){
            if (!this.hasCollision || this.collision.canMoveUp(this.triangle)){
                this.triangle.y--;
            }
        }
        if (this.circle != null) {
            if (!this.hasCollision || this.collision.canMoveUp(this.circle)) {
                this.circle.y--;
            }
        }
    }
    public void moveDown(double dt){
        if (this.rect != null){
            if (!this.hasCollision || this.collision.canMoveDown(this.rect)){
                this.rect.y++;
            }
        }
        if (this.triangle != null){
            if (!this.hasCollision || this.collision.canMoveDown(this.triangle)){
                this.triangle.y++;
            }
        }
        if (this.circle != null){
            if (!this.hasCollision || this.collision.canMoveDown(this.circle)){
                this.circle.y++;
            }
        }
    }
    public void moveRight(double dt){
        if (this.rect != null){
            if (!this.hasCollision || this.collision.canMoveRight(this.rect)){
                this.rect.x++;
            }
        }
        if (this.triangle != null){
            if (!this.hasCollision || this.collision.canMoveRight(this.triangle)){
                this.triangle.x++;
            }
        }
        if (this.circle != null){
            if (!this.hasCollision || this.collision.canMoveRight(this.circle)){
                this.circle.x++;
            }
        }
    }
    public void moveLeft(double dt){
        if (this.rect != null){
            if (!this.hasCollision || this.collision.canMoveLeft(this.rect)){
                this.rect.x--;
            }
        }
        if (this.triangle != null){
            if (!this.hasCollision || this.collision.canMoveLeft(this.triangle)){
                this.triangle.x--;
            }
        }
        if (this.circle != null){
            if (!this.hasCollision || this.collision.canMoveLeft(this.circle)){
                this.circle.x--;
            }
        }
    }
}