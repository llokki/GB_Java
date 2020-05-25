package ru.geekbrains.java_two.lesson2.hw;

public class Main {

    static final int array_size = 4;

    public static void main(String[] args)  {
        String [][] arr = {
                {"24", "7", "4545","123"},
                {"8" ,"45","2","13"},
                {"565" , "4534", "32", "34"},
                {"123", "313", "344", "5636"}
        };
        try {
            System.out.println(ArrayReBuild(arr));
        } catch (MyArraySizeException e) {
           e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("Неправильный элемент массива: " + e.getI() + ", " + e.getJ());
        }
    }

    public static int ArrayReBuild (String [][] arr ) throws MyArraySizeException, MyArrayDataException {
        if (arr.length !=array_size) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != array_size) {
                throw new MyArraySizeException();
            }
        }

        int sum = 0;

        int [][] arr1 = new int[4][4];
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1.length; i++) {
                try {
                    arr1[i][j] = Integer.parseInt(arr [i][j]);
                    sum += arr1[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("format " + i + " " + j, i,j);
                }
            }
        }
        return sum;
    }
}
