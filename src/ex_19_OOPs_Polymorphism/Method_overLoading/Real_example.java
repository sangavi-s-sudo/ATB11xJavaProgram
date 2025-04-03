package ex_19_OOPs_Polymorphism.Method_overLoading;

public class Real_example {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task(3,4);
    }
}
class Home{
    public int task(int a , int b){
        System.out.println("Brother1");
        return a +b;
    }

    public double task(double a ,double b){
        System.out.println("Brother2");
        return a + b;
    }
    public float task (float a , float b){
        System.out.println("Brother3");
        return a+b;
    }
}