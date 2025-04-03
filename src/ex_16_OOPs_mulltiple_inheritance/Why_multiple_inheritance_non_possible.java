package ex_16_OOPs_mulltiple_inheritance;

public class Why_multiple_inheritance_non_possible {
    // Java does not allow this!
// class D extends B, C { }


    // D obj = new D();  // Which show() should be called?
    // obj.show(); // Ambiguity
}

class A {
    void show() {
        System.out.println("class A");
    }
}

class B extends A {
    void show() {
        System.out.println("class B");
    }
}

class C extends A {
    void show() {
        System.out.println("class C");
    }
}


