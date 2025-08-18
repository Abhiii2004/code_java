class MyThread extends Thread {
    public void rn() {
        while (true) {
            System.out.println("cooking");
        }
    }}
    class MyThread1 extends Thread {
        public void rn() {
            int i = 0;
            while (i < 300) {
                System.out.println("listening to podcast");
                i++;
            }
        }}
    public class threads {
        public static void main(String[] args) {
            MyThread t0 = new MyThread();
            MyThread1 t1 = new MyThread1();
            //t0.rn();
            t1.rn();
        }
    }
