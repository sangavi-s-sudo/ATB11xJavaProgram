package ex_24_oops_Abstraction_interface;

public class Multiple_inheritance_using_interface {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.asset();
    }
}

interface Mother{
    void Money();
}

interface Father{
    void money1();
}

class Child implements Mother, Father{

    void asset(){
        Money();
        money1();
    }
    @Override
    public void Money() {
        System.out.println("amma's money");
    }

    @Override
    public void money1() {
        System.out.println("appa's money");
    }
}
