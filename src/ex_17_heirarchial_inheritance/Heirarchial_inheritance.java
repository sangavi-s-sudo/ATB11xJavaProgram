package ex_17_heirarchial_inheritance;

import org.w3c.dom.ls.LSOutput;

public class Heirarchial_inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        Sangavi s11 = new Sangavi();
        Kanivan K11 = new Kanivan();
        Naveen N11 = new Naveen();
        f1.home();
        s11.home();
        K11.home();
        N11.home();
        N11.n1();
        K11.k1();


    }
}

class Father {
    void home() {
        System.out.println("3bhk home of father");
    }
}

class Sangavi extends Father {
    void s1() {
        System.out.println("sangavi-home");

    }
}

class Kanivan extends Father {
    void k1() {
        System.out.println("Kanivan-home");
    }
}

class Naveen extends Father {
    void n1() {
        System.out.println("Naveen-home");
    }

}