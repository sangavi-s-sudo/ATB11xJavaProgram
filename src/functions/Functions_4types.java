package functions;

public class Functions_4types {
    public static void main(String[] args) {
        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        type1();
        int r = type2();
        System.out.println(r);

        type3(3,9);

        short s = type4((short) 1, (short) 1);
        System.out.println(s);
    }
    static void type1(){
        System.out.println("I am type 1");
    }

    static int type2(){
        System.out.println("I am type 2");
        return 4;
    }
    static void type3(int a , int b) {
        System.out.println("I am type 3");

    }
    static short type4(short v,short y){
        System.out.println("I am type 4");
        return (short) (v+y);
    }
    }