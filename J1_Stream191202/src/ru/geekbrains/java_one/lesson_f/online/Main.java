package ru.geekbrains.java_one.lesson_f.online;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static float method1 (int a, int b){
        return a / b;
    }

    private static void method2 () throws IOException{
        throw new IOException("Hello user!");
    }

    public static void main(String[] args)  {
        InputStream in;
        OutputStream out;

        try {
            FileOutputStream fos = new FileOutputStream("test.txt", true);
            PrintStream ps = new PrintStream(fos);
//            byte [] i = {'H','e','l','l','o','\n'};
//            String str = "World!";
//            fos.write(str.getBytes());
            ps.println("Hello World!");
            fos.close();



            FileInputStream fis = new FileInputStream("test.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void exceptions() {
        //        System.out.println(method1(5,0));
        try {
            method2();
        } catch (IOException e) {
            System.out.println("User insert flash drive!");
            e.printStackTrace();
        }
        System.out.println("Main ended");
    }

    private static void strBuild() {
        long startTime = System.nanoTime();

        String str = "Example";
        for (int i = 0; i < 100000; i++){
            str += i;
        }

        float deltaTime = (System.nanoTime() - startTime) * 0.000001f;
        System.out.println(deltaTime + " millisec");

        startTime = System.nanoTime();

        StringBuilder sb = new StringBuilder("Example");
        for (int i = 0; i <100_000; i++) {
            sb.append(i);
        }
        deltaTime = (System.nanoTime() - startTime) * 0.000001f;
        System.out.println(deltaTime + " millisec");
    }

    private static void stringPool () {
        Scanner sc = new Scanner(System.in);
        String s0 = "hello";
        String s1 = "hello";
        String s2 = "hel";
        String s3 = s2 + "lo";
//        String s4 = sc.next();
        s1 += " world";
        System.out.println(s0 == s1);//String pool
        System.out.println(s0 == s3);
//        System.out.println(s0 == s4);
        // F = false
        // T = true
    }

}
