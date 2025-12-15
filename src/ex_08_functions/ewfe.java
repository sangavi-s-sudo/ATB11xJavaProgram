package ex_08_functions;

public class ewfe {
    public static void main(String[] args) {
        type1();
        type2(4);
        int a =type3();
        System.out.println((a));

        float d = type4(3.5f,8.9f);
        System.out.println(d);

    }

    static void type1 (){
        System.out.println("type 1");
    }

    static void type2( int a){
        System.out.println("type 2");
        System.out.println(a);
    }

    static int type3(){
        System.out.println("type 3");
        return 3;
    }

    static float type4(float a , float b){
        System.out.println("type 4");
        return a + b;
    }


}
