package ru.geekbrains.java_one.lesson_d.online.Home_Work;

public class Employee {
    private static String name;
    private static String position;
    private int number;
    private int salary;
    private static int age;

    public Employee (String name,String position,int number,int salary,int age) {
        this.age = age;
        this.name = name;
        this.number = number;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {return name;}
    public String getPosition() {return position;}
    public int getNumber() {return number;}
    public int getSalary() {return salary;}
    public static int getAge() {return age;}


    public static void salaryUp() {
            if (getAge() > 40) {
                System.out.println(name + " , " + position);
            }
        }

}
