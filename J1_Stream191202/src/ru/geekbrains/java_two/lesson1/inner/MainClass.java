package ru.geekbrains.java_two.lesson1.inner;

public class MainClass {
    public static void main(String[] args) {
//        Outer.Inner inner = new Outer().new Inner();

//        Outer outer = new Outer();
//        Outer.Inner inner = outer.new Inner();
//
//
//
//        outer.printInnerVal();
//        inner.printOuterVal();
//
//        Outer.InnerStaticClass.printStaticValFromOuter();

        someThink();
    }

    static void someThink() {
        int z = 10;

        class LocalClass {
            int x;
            public LocalClass(int x) {
                this.x = x;
            }
            void printSqrVal() {
                System.out.println(x * x + z);
            }
        }

        new LocalClass(66).printSqrVal();
    }
}
