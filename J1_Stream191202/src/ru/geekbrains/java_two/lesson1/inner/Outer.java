package ru.geekbrains.java_two.lesson1.inner;

public class Outer {

    private int x = 6;
    private static int xx = 5;

    private void somePrint() {
        System.out.println("hello from outer");
    }

    public void printInnerVal(){
        System.out.println(new Inner().y);
    }

    class Inner{
        int y = 7;

        void printOuterVal() {
            System.out.println(x);
            somePrint();
        }
    }

    static class InnerStaticClass {
        static void printStaticValFromOuter() {
            System.out.println(xx);
        }
    }
}
