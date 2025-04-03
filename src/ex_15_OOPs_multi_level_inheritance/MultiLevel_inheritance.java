package ex_15_OOPs_multi_level_inheritance;

public class MultiLevel_inheritance {
    public static void main(String[] args) {



        GrandFather gf1 = new GrandFather();
        gf1.Gf();
        //gf1.s();
        //gf1.f();
        System.out.println("---------");
        Father f1 = new Father();
        f1.Gf();
        f1.f();
        // f1.s();

        System.out.println("---------");
        Son s2 = new Son();
        s2.Gf();
        s2.f();
        s2.s();


    }
}
