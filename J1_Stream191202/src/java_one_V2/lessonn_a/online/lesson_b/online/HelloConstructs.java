package java_one_V2.lessonn_a.online.lesson_b.online;
import java.util.Arrays;

public class HelloConstructs {

    /*
1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
2 Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);
6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
8 **** Не пользоваться вспомогательным массивом при решении задачи 7.

    * */
        private static int power(int base, int sign) {
            int result = 1;
            for (int i = 0; i < sign; i++) {
                result *= base; // result = result * base;
            }
            return result;
        }

        private static void table() {
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    System.out.print(i * j + ((j == 9) ? "" : "\t"));
                }
                System.out.println();
            }
        }

        private static void arrPrinter(int[] a) { // int[] a = arr;
            for (int i = 0; i < a.length; i++) {
                int value = a[i];
                System.out.print(value + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] arr;
            arr = new int[6];
            int[] ar2 = new int[10];
            int[] ar3 = {1, 2, 3, 4, 6, 8};
            arrPrinter(ar3);

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * 10;
            }
//        arrPrinter(arr);
//        arrPrinter(ar2);

            System.out.println(arr);
            System.out.println(Arrays.toString(arr));

            int[][] ard = new int[3][3];
            ard[0][1] = 1;

        }

        private static void postCycle(int i) {
            do {
                System.out.print(i++ + " ");
            } while (i < 5);
        }

        private static void preCycle(int i) {
            while (i < 5) {
                System.out.print(++i + " ");
            }
        }

        private static void switchCase() {
            String name = "ivan";
            if (name.equals("ivan")) {
                System.out.println("sent to desk #1");
            } else if (name.equals("petr")) {
                System.out.println("sent to desk #2");
            } else if (name.equals("anna")) {
                System.out.println("sent to desk #3");
            } else {
                System.out.println("recipient not found");
            }

            switch (name) {
                case "ivan":
                    System.out.println("sent to desk #1");
                    break;
                case "petr":
                    System.out.println("sent to desk #2");
                    break;
                case "anna":
                    System.out.println("sent to desk #3");
                    break;
                default:
                    System.out.println("recipient not found");
            }
        }

        private static void lessonOneRemains() {
            //method overloading
            System.out.println("Hello world");
            System.out.println(12345);
            System.out.println(1.23456);

            // term
            boolean isABoy = true;
            String name;
            if (isABoy) {
                name = "Petr";
            } else {
                name = "Anna";
            }

            name = (isABoy) ? "Petr" : "Anna";
        }
}
