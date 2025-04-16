package ex_15_OOPs_multi_level_inheritance;

public class Dynamic_dispatch_purpose {
    public static void main(String[] args) {
        Son Naveen = new Son();
        Naveen.s();
        Naveen.f();
        Naveen.Gf();
        System.out.println(Naveen.gold_gf);

        System.out.println("_____________");

        Father f11 = new Father();
        f11.home();
        System.out.println("_____________");

        GrandFather gf11 = new GrandFather();
        gf11.home();
        System.out.println("_____________");

        Son s11 = new Son();
        s11.home();

        System.out.println("_____________");
        GrandFather gf12 = new Son();
        gf12.Gf();
        gf12.home(); // home function is present in both GF and Son class. It will take Son's home fn
        // if son class doesn't have home fn - it will take father's home function
        // in case if father's home function is also not present - it will take grand father's hpme function

        // to resolve this problem of having same name in functions we have dynamic dispatch concept.
        // if all 3 classes have differenmt function names then it will not be a problem

        System.out.println("----------------------");
        Father f12 = new Son();
        f12.home();

        System.out.println("----------------------");
        GrandFather gf14 = new Father();
        gf14.home();
    }
}
