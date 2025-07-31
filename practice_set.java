public class practice_set {
    static class Employee1 {
        int salary;
        String name;
        public int getSalary(){
            return salary;
        }
        public String getName(){
            return name;
        }
        public void setName(String n){
            name=n;
        }
    }
    public static void main(String[]args){
        //problem 1
        Employee1 harry=new Employee1();
        harry.setName("harry is java");
        harry.salary=233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

    }
}
