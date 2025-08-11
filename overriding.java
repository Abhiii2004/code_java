class Q{
    public int meth1(){
        return 1;
    }
    public void meth2(){
        System.out.println("this is method 2 of class Q");
    }
}
class W extends Q{
    @Override
    public void meth2(){
        System.out.println("this is method 2 of class W");
    }
    public void meth3(){
        System.out.println("this is method 3 of class W");
    }
}
public class overriding {
    public static void main(String[] args) {
        Q q=new Q();
        q.meth2();
        W w=new W();
        w.meth2();
    }
}
