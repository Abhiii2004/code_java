class employees {
    String name;
    int id;
    int salary;

    public void getDetails() {
        System.out.println("Employee name is " + name);
        System.out.println("Employee ID is " + id);
        System.out.println("Employee salary is " + salary);

    }
}
    public class prblm {
        public static void main(String[] args) {
            employees E1 = new employees();
            employees E2 = new employees();
            employees E3 = new employees();
            employees E4 = new employees();
            employees E5 = new employees();
            E1.name = "anna";
            E1.id = 1;
            E1.salary = 25000;
            E2.name = "rose";
            E2.id = 2;
            E2.salary = 24000;
            E3.name = "tina";
            E3.id = 3;
            E3.salary = 26000;
            E4.name = "jhon";
            E4.id = 4;
            E4.salary = 28000;
            E5.name = "gina";
            E5.id = 5;
            E5.salary = 29000;
            E1.getDetails();
            E2.getDetails();
            E3.getDetails();
            E4.getDetails();
            E5.getDetails();
            double totalSalary = 0;
                totalSalary =E1.salary+ E2.salary+ E3.salary+E4.salary+ E5.salary;
            System.out.println("Total salary of all employees " + totalSalary);

        }
    }