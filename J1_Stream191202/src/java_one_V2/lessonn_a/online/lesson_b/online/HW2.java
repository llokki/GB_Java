package java_one_V2.lessonn_a.online.lesson_b.online;

import java.util.Arrays;

/*
1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
2 Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);
6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
8 **** Не пользоваться вспомогательным массивом при решении задачи 7
* */
public class HW2 {

//    private static void example1(int [] a){
//        for(int i = 0; i < a.length; i++){
//            if (a[i] == 0) {
//                a[i] = 1;
//            } else {
//                a[i] = 0;
//            }
//            System.out.print(a[i]);
//        }
//    }

//    private static void example2(int [] a, int shift, int step){
//        for (int i = 0; i < a.length; i++){
//            a[i] = i * step + shift;
//        }
//        }


//        private static void example3 (int[] a){
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] < 6) {
//                    a[i] = a[i]*2;
//                } else {
//                    a[i] = a[i];
//                }
//            }
//        }

//    private static void example4min(int [] a){ // четвертое задание поиск минимума и максмума
//        int min = a[1];
//        for(int i = 0; i < a.length; i++) {
//            if (a[i] < min){
//                min = a[i];
//            }
//        }
//        System.out.println("Minimum = " + min);
//    }
//    private static void example4max(int [] a){
//        int max = a[1];
//        for(int i = 0; i < a.length; i++) {
//            if (a[i] > max){
//                max = a[i];
//            }
//        }
//        System.out.println("Maximum = " + max);
//    }

//    private static void example5 (int [][] a){
//        for (int i = 0; i < a.length; i++){
//            a[i][i] = 1;
//            a[i][a.length - 1 - i] = 1;
//            for (int j = 0; j < a.length; j++) {
//                System.out.print(a[i][j]);
//            }
//            System.out.println();
//        }
//    }
    public static void main (String[] args) {
//        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        example1(arr);

//        int [] arr1 = new int [8];
//        example2(arr1, 1,3);
//        System.out.print(Arrays.toString(arr1));

//        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        example3(arr);
//        System.out.print(Arrays.toString(arr));


//        int [] arr = {2,4,7,1,4,2,6, -2, 36, 3241,21,-56};
//        example4min(arr);
//        example4max(arr);

//        int [][] arr = new int[10][10];
//        example5(arr);
   }

}
