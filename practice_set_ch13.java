class mrng extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(3000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        System.out.println("Good morning");
    }
}}
class greet extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(5000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class practice_set_ch13 {
    public static void main(String[] args) {
mrng m=new mrng();
greet g=new greet();
m.setPriority(2);
g.setPriority(6);
        System.out.println(m.getPriority());
        System.out.println(g.getPriority());
        g.start();
        System.out.println( g.getState());
        System.out.println(Thread.currentThread().getState());
m.getState();
g.getState();
//m.start();
//g.start();
// infinite loop of execution of "good morning "and "welcome" alternatively is displayed
    }
}
