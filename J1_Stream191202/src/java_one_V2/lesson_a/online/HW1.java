package java_one_V2.lesson_a.online;
/*Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
где a, b, c, d – целочисленные входные параметры этого метода;

Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
 если да – вернуть true, в противном случае – false;

Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число
 передали, или отрицательное. Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль

Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть приветственное
 сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.

*Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го
* , при этом каждый 400-й – високосный. Для проверки работы вывести результаты работы метода в консоль**/

public class HW1 {

    private static float example1 (int a,int b, int c, int d) {
        int x;
        return x = a * (b + (c / d));
    }

    private static boolean example2 (int a, int b){
        int x;
        x = a + b;
        if (x <= 20 && x > 10){
            return true;
        } else  {
            return false;
        }
    }

    private static void example3(int x){
        if (x < 0) {
            System.out.println("Отрицательное");
        } else if ( x >= 0){
            System.out.println("Положительное");
        }
    }

    private static void example4(String name){
        System.out.println("Привет, " + name);
    }

    private static void example5(int year){
        if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0 )){
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }

    public static void main (String[] args){
        System.out.println(example1(4, 2,12, 23));
        System.out.println(example2(5, 15));
        example3(-2);
        example4("Пол");
        example5(2019);

    }
}
