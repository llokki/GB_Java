package ru.geekbrains.java_one.lesson_g.online;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HV = 1;

    Map() {

        setBackground(Color.BLUE);
 }

 void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.printf("mode = %d\nfsX = %d\nwin = %d", gameMode, fieldSizeX, winLength);

 }
}
