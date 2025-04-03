package ex_19_OOPs_Polymorphism.Method_overLoading;

public class Polymorphism {
    public static void main(String[] args) {
        MathOperationss m1 = new MathOperationss();
        int r1 = m1.add(3,4);
        int r2 = m1.add(5,6,7);
        double r3 = m1.add(3.4,5.5,6.6);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }

}
class MathOperationss{
     // In the same class, When you have a method wit same
    // name but different arguments and different return type.

    int add(int a , int b){
        return a+b;
    }
    int add(int a , int b , int c){
        return a + b +c;
    }
    double add (double a , double b , double c){
        return a+b+c;
    }
}
