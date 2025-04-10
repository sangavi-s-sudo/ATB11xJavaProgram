package ex_26_oops_Static;

public class Static3 {
    public static void main(String[] args) {
        A1 ref1 = new A1(30);
        System.out.println(ref1.a);
        ref1.display();
        System.out.println("--------");
        System.out.println(A1.b);

        System.out.println("--------");
        A1.b = 90;
        A1 ref2 = new A1(60);
        System.out.println(ref2.a);
        ref2.display();
        System.out.println(A1.b);

    }
}

// static means common across all of them. ALl the objects will have the same value.
// we can call static variable using class name becoz it belongs to class.

class A1 {
    int a = 10;
    static int b = 20;

    A1(int a) {
        System.out.println(a);
    }

    void display() {
        System.out.println("print show");
    }
}
