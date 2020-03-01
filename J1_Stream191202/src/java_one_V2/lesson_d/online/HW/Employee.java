package java_one_V2.lesson_d.online.HW;

public class Employee {
    private String name;
    private String position;
    private int birthYear;

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setPosition(String position) { this.position = position; }

    public String getPosition(){ return position; }

    public int getAge() {return 2020 - birthYear;}

    public void setAge (int age) {
        this.birthYear = 2020 - age;
    }


    public Employee (String name, String position, int birthYear) {
        this.name = name;
        this.position = position;
        this.birthYear = birthYear;
    }
}
