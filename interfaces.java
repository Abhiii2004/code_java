interface camera{
    void record();
    void photo();
}
interface network{
    String [] getNetwork();
    void connectToWifi(String network);
}
class Cellphone{
    void callNumber(long phNo){
        System.out.println("call a number"+phNo);
    }
    void pickCall(){
        System.out.println("calling....");
    }
}
class MySmartPhone extends Cellphone implements camera,network{
    public void photo() {
        System.out.println("taking a snapshot");
    }
    public void record() {
        System.out.println("recording a video");
    }
    public String[] getNetwork() {
        System.out.println("getting list of network");
        String []networkList={"abhi","satvik","prathyush"};
        return networkList;
    }
    public void connectToWifi(String network){
        System.out.println("connected to wifi"+network);
}
}
public class interfaces {
    public static void main(String[] args) {
        MySmartPhone sp=new MySmartPhone();
        String []ar=sp.getNetwork();
        for(String item:ar)
            System.out.println(item);
        sp.connectToWifi(ar[1]);
        sp.photo();
        sp.record();
        sp.callNumber(708);
        sp.pickCall();

}}
