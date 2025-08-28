//QUESTION 1
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void ChangeNib(){

    }
}
//QUESTION 2
interface BasicAnimal{
    void eat();
    void sleep();
}
class  Monkey{
    void jump(){
        System.out.println("Jumping\n");
    }
    void bite(){
        System.out.println("Biting\n");
    }}
    class Human extends Monkey implements BasicAnimal{
        @Override
        public void eat(){
            System.out.println("the animal is eating\n");
        }
        @Override
        public void sleep(){
            System.out.println("the animal is sleeping\n");
        }
}
//QUESTION 3
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing.......");
    }
    public void lift(){
        System.out.println("Pick the call");
    }
    public void disconnect(){
        System.out.println("End the call once done with talking");
    }
    public void videoCall(){
        System.out.println("It is a videocall ");
    }
}
//QUESTION 4
interface TvRemote{
     void on();
     void off();
}
interface SmartTvRemote extends TvRemote{
     void mic();
}
class remote implements TvRemote,SmartTvRemote{
    public void on(){
        System.out.println("click the on button to on the TV");
    }
    public void off(){
        System.out.println("click ont the off button to switch off the TV");
    }
    public void mic(){
        System.out.println("Use the mic button to search anything by speech");
    }
}
public class ch11_practice {
    public static void main(String[] args) {
        //Q1
FountainPen fp=new FountainPen();
fp.ChangeNib();
//Q2
        Human h=new Human();
        h.eat();
        h.sleep();
        h.bite();
        h.jump();
        //polymorphism
        Monkey m= new Human();
        m.bite();// you can only call the methods from the monkey class only
    BasicAnimal ba=new Human();
    ba.eat();
    //ba.jump();this cannot be done as it is a method from the monkey, logically not all basic animals can jump
      //Q3
        Telephone t=new SmartTelephone();
        t.ring();
        t.lift();
        t.disconnect();
        //t.videoCall();
        SmartTelephone s=new SmartTelephone();
        s.videoCall();
        //Q4
        remote r= new remote();
        r.on();
        r.mic();
        r.off();

    }
}
