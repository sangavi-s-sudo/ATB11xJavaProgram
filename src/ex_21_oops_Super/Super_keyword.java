package ex_21_oops_Super;

public class Super_keyword {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        System.out.println(v1.maxSpeed);
        v1.show();
        System.out.println("--------");
// -----------------------------------------------
        Car c1 = new Car();
        System.out.println(c1.getMaxSpeed());
        System.out.println("++++++++++");
        c1.show();
        c1.setMaxSpeed(220);
        System.out.println(c1.getMaxSpeed());
    }
}

class Vehicle {
    public int maxSpeed = 250;

    // Default constructor
    Vehicle() {
        System.out.println("It is Default constructor");
    }
// Parametrized constructor

    Vehicle(int a) {
        System.out.println(a + "is PC");
    }
    // Method Overloading - Same, same name function with different arguments.

    void message() {
        System.out.println("no return arguments , no arguments");
    }

    void message(int b) {
        System.out.println("Have arguments");
    }

    void show() {
        System.out.println("Normal function");
    }

}

class Car extends Vehicle {
    private int maxSpeed = 200;

    Car() {
        System.out.println("chil's DC");
    }

    Car(int a) {
        System.out.println("Child's PC1");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void show() {
        System.out.println("child's overriden normal function");
        System.out.println(maxSpeed);
        System.out.println(super.maxSpeed);
        super.show();
        super.message();
        super.message(7);

    }


}