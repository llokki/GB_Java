package ru.geekbrains.java_one.lesson_b.online;

import java.util.Arrays;

public class HomeWorkTwo {

    private static void change (int[] ex1){
        for (int i = 0; i < ex1.length; i++){
            ex1[i] ^= 1; // инвертируем значение изи
        }
    }

    private static void replacer (int[] ex2, int x1, int x2){
        for (int i = 0; i < ex2.length; i++){
            ex2[i] = i * x1 + x2;
        }
    }

    private static void method3 (int[] ex3){
        for (int i = 0; i < ex3.length; i++){
            if (ex3[i] < 6){
                ex3[i] *= 2;
            }
        }
    }
    private static int searchMax(int []ex4) {
        int max = ex4[0];
        for (int i = 0; i < ex4.length; i++) {
            if (ex4[i] > max) {
                max = ex4[i];
            }
        }
        return max;
    }

     private static int searchMin(int []ex4) {
         int min = ex4[0];
         for (int i = 0; i < ex4.length; i++) {
             if (ex4[i] < min) {
                 min = ex4[i];
             }
         }
         return min;
     }

    public static void main(String[] args) {
        int [] ex1 = {1,1,1,0,0,0,};

        System.out.println("Было \t" + Arrays.toString(ex1));
        change(ex1);//применияем метод с инвертацией
        System.out.println("Стало \t" + Arrays.toString(ex1));


        int[] ex2 = new int[8];
        replacer(ex2, 3, 1);
        System.out.println(Arrays.toString(ex2));

        int [] ex3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        method3(ex3);
        System.out.println(Arrays.toString(ex3));

        int [] ex4 = {4,21,5,6,3,8,2};
        System.out.println("Minimum: " + searchMax(ex4));
        System.out.println("Maximum: " + searchMin(ex4));

    }
}

//1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
//2 Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
//3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
//4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
//5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);
//6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
//7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
// 8 **** Не пользоваться вспомогательным массивом при решении задачи 7.
