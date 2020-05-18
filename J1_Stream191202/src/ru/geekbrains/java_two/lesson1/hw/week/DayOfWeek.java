package ru.geekbrains.java_two.lesson1.hw.week;

public enum DayOfWeek {
    Monday(8), Tuesday(8), Wednesday(8), Thursday(8), Friday(7), Saturday(0), Sunday(0);

    private int amt;
    private final int sum = 39;
    private int balance;

    DayOfWeek (int amt) {
        this.amt = amt;
    }

    public int getWorkingHours(DayOfWeek dayOfWeek) {
        balance = sum - this.amt;
        if(balance == 0) {
            System.out.println("Сегодня выходной!!");
        }
        return balance;


    }
}
