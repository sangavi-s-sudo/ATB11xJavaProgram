package ex_23_oops_Abstraction;

public class Abs_try {
    public static void main(String[] args) {
        //New n1 = new New();

        Son11 s1 = new Son11();
        s1.show();
    }
}

abstract class New{
    abstract void show();
}

class Son11 extends New{

    @Override
    void show() {
        System.out.println("Hi all");
    }
}
