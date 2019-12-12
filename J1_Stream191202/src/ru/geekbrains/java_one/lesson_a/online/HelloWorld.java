package ru.geekbrains.java_one.lesson_a.online;

public class HelloWorld {

//    private static void helloUser(String name) {
//        System.out.println("Привет, " + name);
//    }
//
//    private static int math(int arg1, int arg2) {
//        int result;
//        result = arg1 * arg2 / 5;
//        return result;
//    }
    private static int mathOne(int a, int   b, int c, int d){
        int result;
        result = a * (b + (c / d));
        return result;
    }



    public static void main(String[] args){


//        helloUser("Ivan");
//        helloUser("Petr");
        float result =(float)( mathOne(10,87, 5, 20));
        System.out.println(result);
    }

    private static void termOperators() {
        int x = 0;
        int y = 1;
        int fieldX = 2;
        int fieldY = 2;
        if (x < 0 && x > fieldX && y < 0 && y >fieldY) {
            System.out.println("User missed");
        } else {
            System.out.println("Missed again");
        }
    }

    private static void arithmetic() {
        int i = 10;
        i++;
        i += 10; // i = i + 10;
        System.out.println(i / 3f);
    }


    private static void variables() {
            byte b = 120;
            short s = 32000;
            int i = 2147000000;
            long l = 121470000000l;

            float f = 10.1f;
            double d = 10.1;


            boolean boo = true;

            char c = 'A';
            char c0 = 65535;
        System.out.println(c0);

            String str = "Hello";
        System.out.println(str);
        }
}
