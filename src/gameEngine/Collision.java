package gameEngine;

public class Collision {
    Pixels pixels;

    Collision(Pixels pixels){
        this.pixels = pixels;
    }

    private boolean BorderCollision(Rect rect){


        return true;
    }

    public boolean canMoveUp(Rect rect){
        if (rect.y <= 0) return false;

        for (int i = rect.x; i < rect.x+rect.width; i++) {
            if (this.pixels.matrix[rect.y-1][i] != '.'){
                return false;
            }
        }
        return true;
    }

    public boolean canMoveUp(Triangle triangle){
        if (triangle.y <= 0) return false;

        for (int i = triangle.x; i < triangle.x+(2*triangle.height)-1; i++) {
            if (this.pixels.matrix[triangle.y-1][i] != '.'){
                return false;
            }
        }
        return true;
    }

    public boolean canMoveUp(Circle circle){
        if (circle.y <= 0) return false;

        for (int i = circle.x; i < circle.x+circle.rad; i++) {
            if (this.pixels.matrix[circle.y-1][i] != '.'){
                return false;
            }
        }
        return true;
    }


    public boolean canMoveDown(Rect rect){
        if (rect.y+rect.height >= this.pixels.height) return false;


        for (int i = rect.x; i < rect.x+rect.width; i++) {
            if (this.pixels.matrix[rect.y+rect.height][i] != '.'){
                return false;
            }
        }
        return true;
    }

    public boolean canMoveDown(Triangle triangle){
        if (triangle.y+triangle.height >= this.pixels.height) return false;


        for (int i = triangle.x; i < triangle.x+(2* triangle.height)-1; i++) {
            if (this.pixels.matrix[triangle.y+triangle.height][i] != '.'){
                return false;
            }
        }
        return true;
    }

    public boolean canMoveDown(Circle circle){
        if (circle.y+circle.rad >= this.pixels.height) return false;


        for (int i = circle.x; i < circle.x+circle.rad; i++) {
            if (this.pixels.matrix[circle.y+circle.rad][i] != '.'){
                return false;
            }
        }
        return true;
    }

    public boolean canMoveRight(Rect rect){
        if (rect.x+rect.width >= this.pixels.width) return false;

        for (int i = rect.y; i < rect.y+rect.height; i++) {
            if (this.pixels.matrix[i][rect.x+rect.width] != '.'){
                return false;
            }
        }
        return true;
    }

    public boolean canMoveRight(Triangle triangle){
        if (triangle.x+(2*triangle.height)-1 >= this.pixels.width) return false;

        for (int i = triangle.y; i < triangle.y+triangle.height; i++) {
            if (this.pixels.matrix[i][triangle.x+(2*triangle.height)-1] != '.'){
                return false;
            }
        }
        return true;
    }

    public boolean canMoveRight(Circle circle){
        if (circle.x+circle.rad >= this.pixels.width) return false;

        for (int i = circle.y; i < circle.y+circle.rad; i++) {
            if (this.pixels.matrix[i][circle.x+circle.rad] != '.'){
                return false;
            }
        }
        return true;
    }
    public boolean canMoveLeft(Rect rect){
        if (rect.x <= 0) return false;

        for (int i = rect.y; i < rect.y+rect.height; i++) {
            System.out.println("["+rect.x+"]["+i+"]");
            if (this.pixels.matrix[i][rect.x-1] != '.'){
                return false;
            }
        }
        return true;
    }

    public boolean canMoveLeft(Triangle triangle){
        if (triangle.x <= 0) return false;

        for (int i = triangle.y; i < triangle.y+triangle.height; i++) {
            System.out.println("["+triangle.x+"]["+i+"]");
            if (this.pixels.matrix[i][triangle.x-1] != '.'){
                return false;
            }
        }
        return true;
    }

    public boolean canMoveLeft(Circle circle){
        if (circle.x <= 0) return false;

        for (int i = circle.y; i < circle.y+circle.rad; i++) {
            System.out.println("["+circle.x+"]["+i+"]");
            if (this.pixels.matrix[i][circle.x-1] != '.'){
                return false;
            }
        }
        return true;
    }

}