package java_one_V2.lesson_d.online.HW;

import java.util.Arrays;

public class Main {
    public static void main (String[] args){

        Employee [] arr = new Employee[5];

        arr[0] = new Employee("Darius", "elektrik", 1923, 4245123);
        arr[1] = new Employee("Malkolm", "mechanicum", 1023,1234135);
        arr[2] = new Employee("Leonidas", "astartes", 1567,234234234);
        arr[3] = new Employee("Gunnar", "predator", 1000,2346543);
        arr[4] = new Employee("Kroager", "alien", 1234,344456456);

        for (int i = 0; i < arr.length; i++) {
            arr[i].printer();
        }
    }
}
