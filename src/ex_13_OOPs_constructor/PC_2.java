package ex_13_OOPs_constructor;
// Pc helps to create objects when they are created instead of manually assigned  the attributes for each objects
public class PC_2 {
    public static void main(String[] args) {
        // Creating objects with different values
        Car3 car1 = new Car3("Toyota", 2022);
        Car3 car2 = new Car3("Honda", 2020);

        car1.display();
        car2.display();
    }
}

class Car3 {
    String brand;
    int year;

    // Parameterized Constructor
    Car3(String b, int y) {
        brand = b;
        year = y;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Model Year: " + year);
    }


}



