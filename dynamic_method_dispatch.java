class phone{
    public void name(){
        System.out.println("My name is abhi");
    }
    public void on(){
        System.out.println("On the phone");
    }
}
class SmartPhone extends phone{
    public void on(){
        System.out.println("On the smartphone");
    }
    public void music(){
        System.out.println("play the music");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj=new SmartPhone();
        obj.on();// it will run the method from the subclass only
        // not allowed as we can call only the method that is overrided in botth the classes [obj.music();]
    }
}
