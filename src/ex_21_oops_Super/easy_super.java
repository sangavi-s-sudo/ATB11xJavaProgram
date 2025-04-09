package ex_21_oops_Super;

public class easy_super {
    public static void main(String[] args) {
        God g1 = new God();
        g1.display();

        Animal a1 = new Animal();
        System.out.println(a1.color);

        Dog d1 = new Dog();
        d1.display();
    }
}

class God {
    public String color = "NA";

    void display() {
        System.out.println("Super parent's func");
    }
    God(){
        System.out.println("super Parent's constructor.");
    }
}

class Animal extends God {
    protected String color = "white";

    void display() {
        System.out.println("Parent func");
        super.display();
    }

    Animal() {
        System.out.println("Call Parent's constructor");
    }
}

class Dog extends Animal {
    private String color = "black";

    void display() {
        System.out.println(color);
        System.out.println(super.color);
        super.display();
    }

    Dog() {
        System.out.println("Dog's constructor");
    }
}

