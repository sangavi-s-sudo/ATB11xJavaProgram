package ex_02_java;

public class Ternary_operator {
    public static void main(String[] args) {
        //max of two numbers
        int a = 4 ,  b = -3 , c = 10;
        int d = Math.max(a, b);;  // in simplify -> Math.max(a, b);
        System.out.println(d);

        // even or odd
        int e = 10 ;
        boolean g = (e%2 == 0) ? true : false;  // in simplify -> e%2 == 0)
        System.out.println(g);

        //max of three numbers
        int x = 3 , y = 13 , z = 24;

        // rough x > y -> ( (x> z)? x : z)
        int m = Math.max(x, Math.max(y, z));
        System.out.println(m);
    }
}
