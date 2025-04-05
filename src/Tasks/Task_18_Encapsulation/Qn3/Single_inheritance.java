package Tasks.Task_18_Encapsulation.Qn3;

public class Single_inheritance {
    public static void main(String[] args) {
        Son s1 = new Son();
        Father f1 = new Father();
        System.out.println(s1.gold);
        System.out.println(s1.house);
        System.out.println(s1.gold_son);
        System.out.println(s1.house_son);
        s1.asset1();
        s1.asset();

        // son can access both his and his father's attributes and beahavior
        System.out.println(f1.gold);
        System.out.println(f1.house);
        f1.asset();
//        System.out.println(f1.gold_son);
//        f1.asset1();

        // but father can access only his attributes and beahavior


    }
}

class Father {
    int gold = 10;
    String house = "3bhk";

    void asset() {
        System.out.println("father's asset");
    }
}

class Son extends Father {
    int gold_son = 20;
    String house_son = "4bhk";

    void asset1() {
        System.out.println("Son's asset");
    }
}