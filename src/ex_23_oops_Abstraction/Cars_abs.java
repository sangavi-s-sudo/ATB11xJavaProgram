package ex_23_oops_Abstraction;

public class Cars_abs {
    public static void main(String[] args) {
        VolksWagen v1 = new VolksWagen();
        v1.drive();

        // Engine e1 = new Engine(); ---> engine is abstract so cannot be instantiated
    }
}

abstract class Engine{
    abstract void  StartEngine();
    abstract void StopEngine();

}

class VolksWagen extends Engine{

    @Override
    void StartEngine() {
        System.out.println("starting the car");
    }

    @Override
    void StopEngine() {
        System.out.println("stopping the car");
    }

    void drive(){
        StartEngine();
        StopEngine();
    }
}