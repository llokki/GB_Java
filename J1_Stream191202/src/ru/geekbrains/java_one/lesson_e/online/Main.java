package ru.geekbrains.java_one.lesson_e.online;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Barsik" , "Black", 3);
        Dog d = new Dog("Sharik" , "white", 4);
        Bird b = new Bird("Karkoosha", "Grey", 1, 5);
        Parrot p = new Parrot("Polly", "Rainbow", 2, 10);
        SharkFromIkea s = new SharkFromIkea("Akoolka", "blue", 7);

        Animal [] zoo = {c, d, b, p, s};

        for (int i = 0; i < zoo.length; i++){
//            zoo[i].move();
//            zoo[i].voice();
            if(zoo[i] instanceof Bird) {
                System.out.println("cage was enlarged for " + zoo[i].name   );
            }
            if (zoo[i]instanceof Parrot){
                ((Parrot) zoo[i]).speak();
            }
        }
    }

    private static void typecasting() {
        //typecast

        byte b = 10; // 1 byte
        int i = b; // 4 byte
        short s =(short) i;// 2 byte
    }
}