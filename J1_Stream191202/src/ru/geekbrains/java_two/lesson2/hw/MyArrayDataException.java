package ru.geekbrains.java_two.lesson2.hw;
/**
 *Данное исключение выводит предупреждение, если элемент массива является не числовым
 * */
public class MyArrayDataException extends Exception {
        private int i; // номер ячейки
        private int j;


    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public MyArrayDataException(String message, int i, int j) {
        super(message);
        this.i = i;
        this.j = j;
    }
}
