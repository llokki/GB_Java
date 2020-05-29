package ru.geekbrains.java_two.lesson5;

public class CounterNoSyn {
    private int c;


    private Object mon;

    public CounterNoSyn() {
        c=0;
        mon = new Object();

    }
        public void inc(){
                c++;

        }

        public  void dec(){

              c--;
        }



//    public synchronized void inc() {
//        c++;
//    }
//
//    public synchronized void dec() {
//        c--;
//    }

    public int getC() {
        return c;
    }
}
