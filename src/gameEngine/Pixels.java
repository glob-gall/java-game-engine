package gameEngine;

public class Pixels {
    public char[][] matrix;
    Pixels(){
        char[][] matrix = new char[Constants.PIXELS_HEIGHT][Constants.PIXELS_WIDTH];
        for (int i = 0; i < Constants.PIXELS_HEIGHT; i++)
            for (int j = 0; j < Constants.PIXELS_WIDTH; j++)
                matrix[i][j] = '_';

        this.matrix = matrix;
    }
}
