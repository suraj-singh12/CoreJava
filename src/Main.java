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

public class Main {
    public static void main(String[] args) {
        Dummy obj = new Dummy();
        System.out.printf("Hello and welcome!\n");
        System.out.println(Dummy.value);
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}