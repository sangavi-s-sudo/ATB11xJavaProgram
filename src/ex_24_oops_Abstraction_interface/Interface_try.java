package ex_24_oops_Abstraction_interface;

public class Interface_try {
    public static void main(String[] args) {
        ABC a1 = new ABC();
        a1.show3();
        a1.show1();
        a1.show4();
        Naveen.show2();
    }
}

interface Naveen {
    default void show1() {
        System.out.println("hi");
    }

    static void show2() {
        System.out.println("hiii");
    }

    void show3();
}

interface Kavitha {
    void show4();
}

class ABC implements Naveen, Kavitha{

    @Override
    public void show4() {
        System.out.println("HIIIIIII");
    }

    @Override
    public void show3() {
        System.out.println("HEYYY");
    }

    @Override
    public void show1() {
        System.out.println("HEYYYER");
    }
}