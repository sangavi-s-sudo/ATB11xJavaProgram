package ex_30_oops_Generics;

public class Generics_01 {
    public static void main(String[] args) {
        temp_sum(3, 4);
        temp_sum(3.4, 9.8);  // when we want to call temp_sum function with double data type -> it will give error -> for that i have to write another function that supports double
        temp_sum("abc", "def");
    }

    static int temp_sum(int a, int b) {
        return a + b;
    }

    static double temp_sum(double a, double b) {
        return a + b;
    }

    static String temp_sum(String a, String b) {
        return a + b;
    }
}
// Here the problem is we have to write different functions for the same sum behavior with different data types.
// so to solve this we hae generics