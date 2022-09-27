package gameEngine;

import javax.swing.*;

public class Draw {
    private JTextArea asciiDisplay;
    private int width,height;

    Draw(JFrame screen, int width, int height){
        this.width = width;
        this.height = height;

        this.asciiDisplay = new JTextArea();
        this.asciiDisplay.setFont(new java.awt.Font("Monospaced", 0, 4));
        screen.add(asciiDisplay);
    }

    public void drawPixels(char[][] pixels){
        StringBuilder txt = new StringBuilder();

        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                txt.append(pixels[i][j]);
            }
            txt.append('\n');
        }

        this.asciiDisplay.setText(txt.toString());
    }

}
