package ex_23_oops_Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50k();
        s1.loan25k();

        //Father f1 = new Father(); -> this is not possible as this is abstract in nature .n i.e) incomplete claasses cannot hav objcet

        Father f2 = new Son();
        s1.loan50k();
    }
}
abstract class Father{
    abstract void loan50k(); // if we have abstract method , then it shpuld be abstract class

    void loan25k(){
        System.out.println("Father given");
    }
} // ----> this is abstract class


class Son extends Father{

    @Override
    void loan50k() {
        System.out.println("son has given 50k");
    }
}