class circle{
    public int radius;
    circle(int r){
        this.radius=r;
        System.out.println("I am circle parametrized constructor");
    }
    public double area(){
    return Math.PI*this.radius*this.radius;
    }
}
class cyclinder extends circle{
    public int height;
    cyclinder(int r,int h){
        super(r);
        this.height=h;
        System.out.println("I am cyclinder parametrized constructor");
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class rectangle{
    public int length;
    public int width;
    rectangle(int l,int w){
        this.length=l;
        this.width=w;
    }
    public double area(){
        return this.length*this.width;
    }
}
class cuboid extends rectangle{
    public int height;
    cuboid(int l,int w,int h){
        super(l,w);
        this.height=h;
    }
public double volume (){
    return length*width*height;
}
}
public class practice_set_ch10 {
    public static void main(String[] args) {
cyclinder obj=new cyclinder(1,2);
        System.out.println(obj.volume());
        System.out.println(obj.area());
cuboid obj1=new cuboid(2,3,4);
        System.out.println(obj1.area());
        System.out.println(obj1.volume());
    }
}
