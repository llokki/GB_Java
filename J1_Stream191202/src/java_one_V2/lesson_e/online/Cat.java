package java_one_V2.lesson_e.online;

public class Cat {
    String name;
    String color;
    int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void voice() {
            System.out.println(name + " meows");
    }
}
