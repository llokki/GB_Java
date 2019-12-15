package ru.geekbrains.java_one.lesson_d.online.Home_Work;

public class Employee {
    private String name;
    private String position;
    private int number;
    private int salary;
    private int age;
    private int id;

    public Employee(String name, String position, int number, int salary, int age) {
        this.age = age;
        this.name = name;
        this.number = number;
        this.position = position;
        this.salary = salary;
    }

    public int getId () {return id++ ;}
    private void setId(int id) {this.id = 1;}

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
    public int getAge() { return age; }

    public void salaryUp() {
        if (getAge() > 45) {
            salary = salary + 5000;
        }
    }

    public void old() {
        if (getAge() > 40) {
            System.out.println(name + " , " + position + " , " + number + " , " + salary + " , " + age + " , " + id);
        }
    }
}

