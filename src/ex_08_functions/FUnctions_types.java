package ex_08_functions;

public class FUnctions_types {
    public static void main(String[] args) {
        int result = return_int();
        System.out.println(result);

        boolean result1 = return_boolean();
        System.out.println(result1);

        float result2 = return_flot();
        System.out.println(result2);
    }
    static int return_int(){
        return 3;
    }

    static boolean return_boolean(){
        return true;
    }

    static float return_flot(){
        return 3.14f;
    }
}

