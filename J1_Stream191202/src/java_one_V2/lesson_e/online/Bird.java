package java_one_V2.lesson_e.online;

public class Bird extends Animal {

    private int height;

    public Bird(String name, String color, int age, int height) {
        super(name, color, age);
        this.height = height;
    }

    @Override
    public void voice() {
        System.out.println(name + " tweets");
    }

}
