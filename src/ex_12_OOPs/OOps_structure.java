package ex_12_OOPs;

public class OOps_structure {
    public static void main(String[] args) {
        Person amit;
        Person p1 = new Person();
        p1.age=12;
        System.out.println(p1.age);

        // Person - Class
        // p2 - Object Ref
        // new Person() -> Object
        p1.name = "ABC";
        System.out.println(p1.name);
        System.out.println(p1.greet("ABCDE"));

        new Person(); // -> it is a object without any reference -> However, this object is not referenced anywhere, so it cannot be accessed later. That means this object is immediately eligible for garbage collection since it has no reference.
        new Person().name = "Not Ref name"; // in this line we are assigning this object to  "Not Ref name" value . But when it goes to next line it becomes  unreachable . Becoz this object is not stored in any variable
        System.out.println(new Person().name);// so here the default value of String is printed
    }
}



class Person {

    //Attributes/ properties
    String name;
    String color;
    int age;
    boolean isMale;
    double weight;

    // functions / members/behavior

    void sleep() {
        System.out.println("Sleeping");
    }

    String greet(String name) {
        return "hello " + name;
    }

    int amount(int salary) {
        return salary;
    }
}

