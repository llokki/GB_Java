package ru.geekbrains.java_two.lesson5;

public class CounterTwoVal {
    private int c1;
    private int c2;


    private Object mon1;
    private Object mon2;

    public CounterTwoVal() {
        c1=0;
        c2=0;
        mon1 = new Object();
        mon2 = new Object();

    }
    public void inc1(){
        synchronized (mon1){
            c1++;
        }
    }

    public  void dec1(){
        synchronized (mon1){
            c1--;
        }
    }

    public void inc2(){
        synchronized (mon2){
            c2++;
        }
    }

    public  void dec2(){
        synchronized (mon2){
            c2--;
        }
    }

    public int getC1() {
        return c1;
    }

    public int getC2() {
        return c2;
    }
}
