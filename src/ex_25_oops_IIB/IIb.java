package ex_25_oops_IIB;

public class IIb {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("------");
        new A();  // At the object creation it will call
        A b ; // this is not object creation
    }
}
// ```
//IIB
//Instance initialization Block == IIB
//I will be executed when Object is created.
//```

// IIB and constructors will be called at the time of object creation. Here first IIB, then constructor will be called.

class A {
    A() {
        System.out.println("I am DC");
    }

    {
        System.out.println("hi I am IIB 1");
    }

    {
        System.out.println("hi I am IIB 2");
    }

    {
        System.out.println("hi I am IIB 3");
    }

    {
        System.out.println("hi I am IIB 4");
    }


}