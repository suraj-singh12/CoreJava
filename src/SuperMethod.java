public class SuperMethod {
    public static void main(String[] args) {
        Childd2 c2 = new Childd2();

        System.out.println();
        Childd2 c3 = new Childd2();


        System.out.println();
        Childd c = new Childd();
        c.print();
    }
}
class Parent {
    int x = 12342;
    Parent() {
        System.out.println("Parent Constructor");
    }
    Parent(int x) {
        this();             // calls default constructor of own class
        this.x = x;
    }
    void print() {
        System.out.println("Parent");
    }
}

class Childd extends Parent {
     Childd() {
         super(56);     // explicit call to parameterized parent constructor
         System.out.println("Childd Constructor");
     }
    int x = 3454;
    @Override
    void print() {
        System.out.println("current x: " + x);
        System.out.println("super.x : " + super.x);
        System.out.println("Childd");
        super.print();
    }
}

class Childd2 extends Parent {
    Childd2() {
        // the default constructor of parent is called automatically before executing the child's
        System.out.println("Childd2 Constructor");
    }
    Childd2(int x) {
        this();     // calls default constructor of own class
        // other code
    }
}