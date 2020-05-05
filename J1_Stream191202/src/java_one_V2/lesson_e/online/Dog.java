package java_one_V2.lesson_e.online;

public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(name + " barks");
    }


}

