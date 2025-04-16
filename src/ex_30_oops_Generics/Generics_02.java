package ex_30_oops_Generics;

public class Generics_02 {
    public static void main(String[] args) {
        temp_sum1(3, 4);
        temp_sum1(3.4, 9.8);  // when we want to call temp_sum function with double data type -> it will give error -> for that i have to write another function that supports double
        temp_sum1("abc", "def");
    }

    static < k > k temp_sum1(k a, k b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}



