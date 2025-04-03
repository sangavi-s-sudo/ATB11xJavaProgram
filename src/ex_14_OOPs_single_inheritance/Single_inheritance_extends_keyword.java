package ex_14_OOPs_single_inheritance;

public class Single_inheritance_extends_keyword {
    public static void main(String[] args) {
        Father f1 = new Father();
        f1.gold_father = 1000;
        System.out.println(f1.gold_father);
        f1.bhK_2();

        System.out.println("___________________________" );
        Son s1 = new Son();
        s1.bike = 1;
        System.out.println(s1.bike);
        s1.bhk_3();
        System.out.println("___________________________" );
// single inheritance
        System.out.println( s1.gold_father);
        s1.bhK_2();
        System.out.println("___________________________" );

// cysclic inheritance is not possible --> father cannot son's properties
        //f1.bhk_3();

    }
}
class Father{
    int gold_father = 10000;
    void bhK_2(){
        System.out.println("2bhk of father");
    }
}

class Son extends Father{
    int bike = 1;
    void bhk_3(){
        System.out.println("3bhk of son");
    }
}