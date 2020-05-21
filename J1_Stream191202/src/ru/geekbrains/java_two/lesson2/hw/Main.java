package ru.geekbrains.java_two.lesson2.hw;

public class Main {




    public static void main(String[] args)  {
        String [][] arr = {
                {"24", "7", "4545","123"},
                {"8" ,"45","2","13"},
                {"565" , "4534", "32", "34"},
                {"123", "313", "344", "5636"}
        };
        System.out.println(ArrayReBuild(arr));

        //System.out.println(array.length);
//        System.out.println(array[2].length);


    }

    public static int ArrayReBuild (String [][] arr ) throws MyArrayDataException {
        int sum = 0;

        int [][] arr1 = new int[4][4];
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i][j] = Integer.parseInt(arr [i][j]);



                sum += arr1[i][j];
            }
        }

        return sum;
    }


}
