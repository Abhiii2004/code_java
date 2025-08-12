abstract class parent {
    public parent() {
        System.out.println("parent");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract void greet();
}
    class child1 extends parent {
        @Override
        public void greet() {
            System.out.println("NAMASTE");
        }
    }
        class child2 extends parent {
            @Override
            public void greet() {
                System.out.println("NAMASKARA");
            }}

    public class abstractClass {
        public static void main(String[] args) {
            parent c = new child1();
            parent c1 =new child2();
           c.greet();
           c1.greet();
        }
    }