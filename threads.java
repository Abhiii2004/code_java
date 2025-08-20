class MyThread extends Thread {
    public void run() {
        System.out.println("cooking");
    }
}

class MyThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 300) {
            System.out.println("listening to podcast");
            i++;
        }
    }
}
class MyThreadRunnable implements Runnable {
    public void run() {
        System.out.println("My thread using runnable");
    }
}

public class threads {
    public static void main(String[] args) {
        MyThread t0 = new MyThread();
        MyThread1 t1 = new MyThread1();

        t0.start();
        t1.start();

        MyThreadRunnable t3 = new MyThreadRunnable();
        Thread t2 = new Thread(t3);
        t2.start();
    }
}
