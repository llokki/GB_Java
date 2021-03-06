package ru.geekbrains.java_one.lesson_b.online;


import java.util.Arrays;

public class HelloConstructs {



    private static int power(int base, int sign){
        int result = 1;
        for (int i = 0; i < sign; i++){
            result *= base;
        }

        return result;
    }

    private static void table() {
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.print(i * j + ((j == 9) ? "" : "\t" ));
            }
            System.out.println();
        }
    }

    private static void arrPrinter(int a[]){
        for (int i = 0; i < a.length    ; i++){
            int value = a[i];
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr;
        arr = new int[6];
        int[] ar2 = new int[10];


        for (int i = 0; i < arr.length; i++){
            arr[i] = i * 10;
        }
//        arrPrinter(arr);
//        arrPrinter(ar2);

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));



    }

    private static void postCycle(int i) {
        do {
            System.out.println(i++ + " ");

        } while (i < 5);
    }

    private static void preCycle(int i) {
        while (i < 5) {
            System.out.println(i++ + " ");
        }
    }

    private static void switchCase() {
        String name = "Ivan";
        if (name.equals("Ivan")) {
            System.out.println("sent to desk #1");
        }else if (name.equals("Petr")){
            System.out.println("sent to desk #2");
        }else if (name.equals("Anna")){
            System.out.println("sent to desk #3");
        }else {
            System.out.println("recipient not found");
        }

        switch (name) {
            case "Ivan" :
                System.out.println("sent to desk #1");
                break;
            case "Petr" :
                System.out.println("sent to desk #2");
                break;
            case "Anna" :
                System.out.println("sent to desk #3");
                break;
            default:
                System.out.println("recipient not found");
        }
    }

    private static void lessonOneRemains() {
        // method overloading
        System.out.println("Hello world");
        System.out.println(12345);
        System.out.println(1.2345);


        //term
        boolean isABOy = true;
        String name;
        int a;
        if (isABOy) {
            name = "Petr";
        } else  {
            name = "Anna";
        }

        name = (isABOy) ? "Petr" : "Anna" ;
    }
}
