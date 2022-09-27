package gameEngine;

import java.awt.*;

public class Constants {
    public int SCREEN_WIDTH;//800
    public int SCREEN_HEIGHT;//600
    public static String SCREEN_TITLE; //Pong

//    public static final double PADDLE_WIDTH = 10;
//    public static final double PADDLE_HEIGHT = 100;
//    public static final Color PADDLE_COLOR = Color.WHITE;
//
//    public static final double BALL_WIDTH = 10;
//
//    public static final double HZ_PADDING = 40;
//
//    public static double TOOLBAR_HEIGHT;
//    public static double INSETS_BOTTOM;
//    public static final double PADDLE_SPEED = 250;
//    public static final double BALL_SPEED = 100;
//    public static final double MAX_ANGLE = 45;

    public Constants(int SCREEN_WIDTH, int SCREEN_HEIGHT, String SCREEN_TITLE){
        this.SCREEN_WIDTH = SCREEN_WIDTH;
        this.SCREEN_HEIGHT = SCREEN_HEIGHT;
        this.SCREEN_TITLE = SCREEN_TITLE;
    }
}
