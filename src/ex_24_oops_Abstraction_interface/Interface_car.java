package ex_24_oops_Abstraction_interface;

public class Interface_car {
    public static void main(String[] args) {
        Vandi v1 = new Vandi();
        v1.applyBrakes();
        v1.test();
    }
}

interface Engines {
        void test();
}

interface Brakes{
    void applyBrakes();
}

class Vandi implements Engines, Brakes {

    @Override
    public void applyBrakes() {
        System.out.println("Brake func");
    }

    @Override
    public void test() {
        System.out.println("Engines func");
    }
}
