package ex_15_OOPs_multi_level_inheritance;

public class DynamicDispatch {
    public static void main(String[] args) {
        GrandFather w1= new Son();

        Father w2 = new Son();
        GrandFather w3 = new Father();
        // If we have given same name to all functions then whoever object is created we will call that function
        w1.home();
        w2.home();
        w3.home();


        // Above concept is called dynamic dispatch  -> we can have grandfather/father's references on the son's object

// --------------------------------------------------


// Below three are not possible
//        1. when your GF is born -> Father is not born
//        2. when your GrandFather is born -> son is not born
//        3. when your GrandFather is born -> Father is not born

//        Father r1 = new GrandFather();
//        Son r2 = new GrandFather();
//
//        Father  r3 = new GrandFather();

    }
}
