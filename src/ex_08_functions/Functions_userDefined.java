package ex_08_functions;

public class Functions_userDefined {
    public static void main(String[] args) {

        num();
        num1(3);
        int d = num2();
        System.out.println(d);
         float e = num3(3.14f, 7.5f);
        System.out.println(e);


    }

    static void num(){
        System.out.println("Hi num");
    }

    static void num1(int i){
        System.out.println(i);
    }

    static int num2(){
        return 31;
    }

    static float num3( float a , float b){
        return a +b;
    }
}