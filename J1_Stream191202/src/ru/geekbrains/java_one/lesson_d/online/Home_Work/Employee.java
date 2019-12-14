package ru.geekbrains.java_one.lesson_d.online.Home_Work;

public class Employee {
    private String name;
    private String position;
    private int number;
    private int salary;
    private int age;

    public Employee(String name, String position, int number, int salary, int age) {
        this.age = age;
        this.name = name;
        this.number = number;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }


    public void salaryUp() {
        for (int i = 0; i < 5; i++) {
            if (getAge() > 40) {
                System.out.println(name + " , " + position);
            }
        }

    }
}