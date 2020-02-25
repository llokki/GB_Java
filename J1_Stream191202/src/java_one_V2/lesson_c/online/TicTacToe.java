package java_one_V2.lesson_c.online;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {


    private static final char DOT_HUMAN = 'X';
    private static final  char DOT_AI = '0';
    private static final char DOT_EMPTY = '.';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int winableComb = 5;


    // field 3x3
    // hum_dot
    // ai_dot
    private static void initField() {
        fieldSizeX = 5;
        fieldSizeY = 5;
        field = new char[fieldSizeY][fieldSizeX];
        for( int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++){
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++)
            System.out.print((i % 2 == 0) ? "-" : i / 2 + 1);
        System.out.println();

        for (int i = 0; i < fieldSizeX; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++)
                System.out.print(field[i][j] + "|");
            System.out.println();
        }

        for (int i = 0; i < fieldSizeX * 2 + 1; i++)
            System.out.print("-");
        System.out.println();
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите пожалуйста, координаты X от 1 до 5 и координаты Y от 1 до 5 через пробел");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_HUMAN;
    }

    // check bounds
    // check valid
    private static boolean isValidCell(int x, int y) {
        return x >=0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    };

    private static boolean isEmptyCell(int x, int y){
        return field[y][x] == DOT_EMPTY;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;
    }

     static boolean checkWin1(char sum) {
        for (int i = 0; i < fieldSizeY; i++){
            int result = 0;
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[i][j] == sum) result++;
            }
            if (result == winableComb) return true;
        }
        for (int i = 0; i < fieldSizeY; i++){
            int result = 0;
            for (int j = 0; j < fieldSizeX; j++){
                if (field[j][i] == sum) result++;
            }
            if (result == winableComb) return true;
        }
         return false;
     }
//    private static boolean checkWin(char c) {
//        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
//        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
//        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;
//
//        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
//        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
//        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;
//
//        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
//        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
//        return false;
//    }

    private static boolean isDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        initField();
        printField();
        while (true){
            humanTurn();
            printField();
            if (checkWin1(DOT_HUMAN)) {
                System.out.println("Human win");
                break;
            }
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }
            aiTurn();
            printField();
            if (checkWin1(DOT_AI)) {
                System.out.println("Computer win!");
                break;
            }
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }
        }

    }
}
