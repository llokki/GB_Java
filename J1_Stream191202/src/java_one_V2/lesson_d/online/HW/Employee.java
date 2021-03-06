package java_one_V2.lesson_d.online.HW;

import java.util.Arrays;
import java.util.Random;

public class Employee {
    private Random random = new Random();
    private String name;
    private String position;
    private int birthYear;
    private int salary;
    private int id;

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setPosition(String position) { this.position = position; }

    public String getPosition(){ return position; }

    public int getAge() {return 2020 - birthYear;}

    public void setAge (int age) {
        this.birthYear = 2020 - age;
    }

    public void setSalary (int salary) {this.salary = salary;}

    public int getSalary() { return salary;}

    public int getId() {return id = random.nextInt(10);}

    public Employee (){getId();}
    public Employee (String name, String position, int birthYear, int salary) {
        this();
        this.name = name;
        this.position = position;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    public void printer() {
        if( getAge() > 40){
            System.out.println("Name: " + getName() + " Position: " + getPosition() + " " + getAge() + " " + getId());
        }
    } // выводим даные о сотрудниках старше 40 лет + идентификатор
    public void upper() {
        if ( getAge() > 45) {
            salary = salary + 5000;
            System.out.println(getName() + " старше 45 лет и его зарплата теперь " + getSalary() + " рублёв");
        }
    } // повышаем на 5к сотрудникам старше 45 лет
}
