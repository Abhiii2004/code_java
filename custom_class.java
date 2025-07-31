class employee {
    int id;
    String name;
    int salary=2500;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class custom_class{
    public static void main(String[] args){
        System.out.println("this is our custom class");
        employee harry=new employee();
        employee abhi=new employee();
        harry.id=32;
        harry.name="job";
        abhi.name="Abhilasha G";
        abhi.salary=1900;
        harry.printDetails();
        abhi.printDetails();
        int salary=abhi.getSalary();
        System.out.println(salary);
        //System.out.println(harry.id);
    }
}