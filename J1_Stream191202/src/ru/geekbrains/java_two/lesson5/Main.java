package ru.geekbrains.java_two.lesson5;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread("t1"); //первый способ
//        MyThread t2 = new MyThread("t2");
//
//        t1.start();
//        t2.start();


//        Thread t1 = new Thread(new MyRunnable("t1"));
//        Thread t2 = new Thread(new MyRunnable("t2"));
//
//        t1.start();
//        t2.start();



//        Thread t1 = new Thread(() -> { //второй способ
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("t1 " + i);
//                    System.out.println("thread name " + Thread.currentThread().getName() );
//                }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("t2 " + i);
//                System.out.println("thread name " + Thread.currentThread().getName() );
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        System.out.println("thread name " + Thread.currentThread().getName() );


//        Thread t1 = new Thread(() -> { //третий способ
//            System.out.println(1);
//
//        });
//
//        Thread t2 = new Thread(() -> {
//            System.out.println(2);
//        });
//
//        t1.start();
//        t2.start();
//
//        System.out.println(3);


//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                System.out.println(i);
//            }
//        });
//
//        t1.start();
//
//        try {
//            t1.join();                                              //просим основной поток (main)
                                                                     //подождать,пока первый поток закончит работать
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//


//        Counter counter = new Counter();
//        Thread t1 = new Thread(()-> {
//            for (int i = 0; i < 1000000; i++) {            //синхронизация потоков
//                counter.inc();
//            }
//        });
//
//        Thread t2 = new Thread(()-> {
//            for (int i = 0; i < 1000000; i++) {
//                counter.dec();
//            }
//        });
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(counter.getC());




//        CounterNoSyn counterNoSyn = new CounterNoSyn();
//        Object mon = new Object();
//
//        Thread t1 = new Thread(()-> {
//            for (int i = 0; i < 1000000; i++) {
//                synchronized (mon){
//                    counterNoSyn.inc();              // критическая секция(внешняя синхронизация), используем,
//                                                    // если не можем менять класс, либо это стандартный класс,
//                                                   // документированный как синхронизированный
//
//                }
//            }
//        });
//
//        Thread t2 = new Thread(()-> {
//            for (int i = 0; i < 1000000; i++) {
//                synchronized (mon){
//                    counterNoSyn.dec();
//                }
//            }
//        });
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(counterNoSyn.getC());

//



//        Thread t = new Thread(new Runnable() {
//
//            int seconds = 0;
//            @Override
//            public void run() {
//                while (!Thread.currentThread().isInterrupted()) { // состояние флага(если кто-то его вызывает-остановись
//                    try {
//                        Thread.sleep(1000 );
//                    } catch (InterruptedException e) {
////                        e.printStackTrace();
//                        break;
//                    }
//                    seconds++;
//                    System.out.println("Time: " + seconds);
//                }
//
//            }
//        });
//
//        t.start();
//
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        t.interrupt(); // передача информации с просьбой остановится данному потоку





        System.out.println("END");

    }
}
