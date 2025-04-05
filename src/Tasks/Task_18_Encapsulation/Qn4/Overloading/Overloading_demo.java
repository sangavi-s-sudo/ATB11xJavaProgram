package Tasks.Task_18_Encapsulation.Qn4.Overloading;

public class Overloading_demo {
    public static void main(String[] args) {
        OverLoad p1 = new OverLoad();
        p1.name();
        System.out.println(p1.name("Sangavi"));
        System.out.println(p1.name(2, 3));
        p1.name(4);
    }
}

class OverLoad {
    void name() {
        System.out.println("1st method");
    }

    void name(int a) {
        System.out.println(a);
    }

    int name(int a, int b) {
        return a + b;
    }

    String name(String ab) {
        return ab;
    }
}
