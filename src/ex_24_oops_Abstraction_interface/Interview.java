package ex_24_oops_Abstraction_interface;


public class Interview {
    public static void main(String[] args) {
        ConcreteClass c1 = new ConcreteClass();
        c1.dispaly3();
        c1.display();
    }
}

class ConcreteClass extends Incomplete_abstract implements IncompleteClass {

    @Override
    public void dispaly3() {

    }

    public  void display1(){

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
