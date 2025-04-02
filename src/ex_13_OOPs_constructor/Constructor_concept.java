package ex_13_OOPs_constructor;

public class Constructor_concept {
    public static void main(String[] args) {
        Baby b1 =  new Baby();

    }
}

class Baby{
    String name;
    int age;
    boolean isGirl;

    void cry(){}
    void sleep(){}
    void eat(){}


    Baby(){
        System.out.println("I am called as Default Constructor!");
    }
}

