package ex_19_OOPs_Polymorphism.Method_overriding;

public class Moverriding_automation {
    public static void main(String[] args) {
        google g1 = new google();
        g1.browser();

        firefox f1 = new firefox();
        f1.browser();

        CommonToAll c1 = new CommonToAll();
        c1.browser();

        // dynamic dispatch   --> Father's reference with child object

        CommonToAll c2 = new google();
        c2.browser();

        CommonToAll c3 = new firefox();
        c3.browser();

        // google g3 = new CommonToAll(); -----> not possible

    }
}

class CommonToAll {
    void browser() {
        System.out.println("Common browser");
    }
}

class google extends CommonToAll {
    @Override
    void browser() {
        System.out.println("google browser");
    }
}

class firefox extends CommonToAll {
    @Override
    void browser() {
        System.out.println("Firefox browser");
    }
}