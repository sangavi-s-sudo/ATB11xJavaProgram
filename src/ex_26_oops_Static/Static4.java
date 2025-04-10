package ex_26_oops_Static;

public class Static4 {
    public static void main(String[] args) {
        // without creating objects i can call static variables or methods

        System.out.println(B.b);
        B.commonToAll();
        System.out.println("------");
        // But without creating objects i can't call instance variables
        // Eg. B.display();

        B b_ref = new B();

        System.out.println(b_ref.a);
        b_ref.display();

        B.b= 100;
        System.out.println(B.b);

    }
}

class B{
    static { // static method
        System.out.println("SIB, called once,when  class is loaded");
    }
    int a = 10; // non-static variable or instance variables or attributes or fields or properties
    static int b = 50;// static variables

    void display(){ // non-static methods
        System.out.println("Non static F(n)");
        System.out.println(b); // we can call static variable inside non-static method block

    }
    static void commonToAll(){// static methods
//        System.out.println(a);  // we can't  call instance variable inside static method block
        System.out.println("Static F(n)");
    }

//    static class C{
//        // Not useful in automation
//    }
}
