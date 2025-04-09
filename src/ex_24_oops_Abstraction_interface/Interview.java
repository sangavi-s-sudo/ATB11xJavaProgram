package ex_24_oops_Abstraction_interface;


public class Interview {
    public static void main(String[] args) {

    }
}

class ConcreteClass implements IncompleteClass {



    @Override
    public void dispaly3() {

    }
}

interface IncompleteClass {
    int a = 10;

    default void display(){
        System.out.println("hi");
    };

    static void dispaly2(){
        System.out.println("hi s");
    }
    void dispaly3 ();
}

abstract class Incomplete_abstract {
    int a = 10;

    abstract void display1();

    void display2(){
        System.out.println("Hi");
    }
}
