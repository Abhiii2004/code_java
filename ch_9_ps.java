class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea()

    {
        return 2 * 3.14 * radius * height + 2 * 3.14 * radius * radius;
    }
}
public class ch_9_ps {
    public static void main(String[] args) {
        //prblm 1
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(13);
        //System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(4);
        //System.out.println(myCylinder.getRadius());*/
        //prblm 2
        System.out.println(myCylinder.surfaceArea());
    }
}
