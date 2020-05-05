package java_one_V2.lesson_e.online;

public class Cat extends Animal{

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
            System.out.println(name + " meows");
    }

}
