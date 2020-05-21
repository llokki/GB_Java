package ru.geekbrains.java_two.lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try {
//            int a = 10;
//            int b = 5;
//            System.out.println(b / a);
//
//            try {
//                int[] arr = {3, 4, 5};
//                System.out.println("Сейчас должна быть ошибка");
//                arr[58] = 99;
//            }catch (  ArrayIndexOutOfBoundsException e) {
//                System.out.println("Внутренний");
//                e.printStackTrace();
////                throw e;
//                throw new RuntimeException("Сами вызывали");
//            }
//
//        } catch (ArithmeticException   e){
//            e.printStackTrace();
//        }  catch (  ArrayIndexOutOfBoundsException e){
//            System.out.println("Внешний");
//            e.printStackTrace();
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }

//
//        try {
//            int a = 0;
//            int b = 5;
//            System.out.println(b / a);
//        } catch (ArithmeticException e) {
//            System.out.println("catch ArithmeticException");
//        } finally {
//            System.out.println("finally");
//        }



//        openFile("1.txt");

        try {
            System.out.println(factorial(-5));
        } catch (FactorialException e) {
            e.printStackTrace();
            System.out.println("number: " + e.getNumber());
        }


        try {
            printKoren(1,0,9);

        } catch (NoRootException e) {
            e.printStackTrace();
            System.out.println(e.getA()+ " " + e.getB() + " " + e.getC());
        }



        System.out.println("end");
    }


    static void printKoren( double a, double b, double c){
        if(b * b - 4 * a * c < 0){
            throw new NoRootException("Дискременант меньше нуля, не корней" , a, b, c);
        }
        System.out.println("Тут корни");
        //...
    }


    static int factorial(int n) throws FactorialException {
        int f = 1;
        if (n < 1) {
            throw new FactorialException("Значение меньше 0", n);
        }
        for (int i = 1; i <= n ; i++) {
            f*= i;

        }
        return f;
    }

    static void openFile(String filename){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
            int x;
            while ( (x = fis.read())>-1 ) {
                System.out.print((char)x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(" finally");
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }


    double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Корень из отрицательного не вычисляется");
        }
        return Math.sqrt(x);
    }


    }
