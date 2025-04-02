package ex_13_OOPs_constructor;

public class Constructor_part3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Tesla";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        System.out.println("_________________________");
        Car c2 = new Car();

        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);
    }
}
class Car{
    String name;
    int year;
    String model;

    void run(){}

    Car(){
        name = "unknown car";
        year = 1990;
        model = "ABC";
    }
}
