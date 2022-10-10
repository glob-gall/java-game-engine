package gameEngine;

public class Triangle extends Shape{
    public int x,y,height;
    public char texture;

    public Triangle(int x, int y, int height, char texture){
        this.x = x;
        this.y = y;
        this.height = height;
        this.texture = texture;
        this.width = (2*height);
    }

}
