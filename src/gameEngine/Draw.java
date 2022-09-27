package gameEngine;

import javax.swing.*;

public class Draw {
    private JTextArea asciiDisplay;
    private int col,row;

    Draw(JFrame screen, int col, int row){
        this.col = col;
        this.row = row;

        this.asciiDisplay = new JTextArea();
        this.asciiDisplay.setFont(new java.awt.Font("Monospaced", 0, 10));
        screen.add(asciiDisplay);
    }

    public void drawPixels(char[][] pixels){
        StringBuilder txt = new StringBuilder();

        for (int i = 0; i < this.col; i++) {
            for (int j = 0; j < this.row; j++) {
                txt.append(pixels[i][j]);
            }
        }

        this.asciiDisplay.setText(txt.toString());
    }

}
