// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

class Dummy {
    Dummy(String data) {
        System.out.println("from parameterized constructor: " + data);
    }
    Dummy() {
        this("sample data");
        System.out.println("default constructor");
    }
    static int value = 2343;
    String name = "Alpha";
    String getName() {
        return name;
    }
    static void printValue() {
        System.out.println(value);
//        System.out.println(name);         // can't directly access non-static member
//        System.out.println(getName());        // can't directly access non-static method
    }

}

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
public class Main {
    public static void main(String[] args) {
//        -----------------Inheritance------------------------


        Child c1 = new Child();
        c1.hello();
        // parent can hold child but child should not hold parent object
        Base c2 = new Child();      // instance of subclass (Child) assigned to variable of Base class (polymorphism/upcasting)
        c2.hello();
        // c2.name();          // error, parent can't see new things introduced in child
        ((Child)c2).name();     // explicit type casting of c2 to Child class (down-casting), now it can see all new things introduced in child, + inherited ones from parent


        Child cc = (Child) new Base();      // Casting 'new Base()' to 'Child' will produce 'ClassCastException' for any non-null value
        // cc.name();              // will lead to runtime error (because Base object does not have name())
        // that's why child should not hold parent object



//        ----------------------------------------------------



        Dummy obj = new Dummy();
        System.out.printf("Hello and welcome!\n");
        System.out.println(Dummy.value);
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}