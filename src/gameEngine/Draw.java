package gameEngine;

import javax.swing.*;
import java.awt.*;

public class Draw {
    private JTextArea asciiDisplay = new JTextArea();
    private int width,height;


    Draw(JFrame frame){
        this.width = Constants.PIXELS_WIDTH;
        this.height = Constants.PIXELS_HEIGHT;

        this.asciiDisplay.setFont(new java.awt.Font(Constants.fontName, Font.BOLD, 10));
        frame.add(asciiDisplay);
    }

    public void drawPixels(Pixels pixels){
        StringBuilder txt = new StringBuilder();

        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                txt.append(pixels.matrix[i][j]);
            }
            txt.append('\n');
        }

        this.asciiDisplay.setText(txt.toString());
    }

    public void drawRect(Pixels pixels,int x, int y,int width, int height, char texture){
        if (x < 0) return;
        if (y < 0) return;
        if (x+width > this.width) return;
        if (y+height > this.height) return;

        for (int i = y; i < y+height; i++) {
            for (int j = x; j < x+width; j++) {
                pixels.matrix[i][j] = texture;
            }
        }
    }
    public void drawRect(Pixels pixels,Rect rect){
        if (rect.x < 0) return;
        if (rect.y < 0) return;
        if (rect.x+rect.width > this.width) return;
        if (rect.y+rect.height > this.height) return;

        for (int i = rect.y; i < rect.y+rect.height; i++) {
            for (int j = rect.x; j < rect.x+rect.width; j++) {
                pixels.matrix[i][j] = rect.texture;
            }
        }
    }

    public void drawTriangle(){}
    public void drawCircle(){}

}
