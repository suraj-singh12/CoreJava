
class Base {
    void hello() {
        System.out.println("Hello from Base");
    }
}

// single inheritance
class Child  extends Base{
    @Override
    void hello() {
        System.out.println("Hello from Child");
    }
    void name() {
        System.out.println("Child");
    }
}

// hierarchical inheritance (Child <-  (Child1, Child2))
// multilevel inheritance (Base <- Child <- Child1)
class Child1 extends Child {
}
class Child2 extends Child {
}

public class Inheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.hello();

        // parent CAN hold child but, child CAN NOT hold parent object
        Base c2 = new Child();      // instance of subclass (Child) assigned to variable of Base class (polymorphism/upcasting)
        c2.hello();
        // c2.name();          // error, parent can't see new things introduced in child
        ((Child)c2).name();     // explicit type casting of c2 to Child class (down-casting), now it can see all new things introduced in child, + inherited ones from parent

        // Child cc = (Child) new Base();      // Casting 'new Base()' to 'Child' will produce 'ClassCastException' for any non-null value
        // throws exception: Exception in thread "main" java.lang.ClassCastException: class Base cannot be cast to class Child

    }
}
