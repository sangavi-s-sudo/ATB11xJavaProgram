package ex_03_ternary_operator;

public class Lab_01_ternary_max3 {
    public static void main(String[] args) {
        int n1 = 5, n2 = 10, n3= 22;
        int max = (n1 > n2) ? (Math.max(n1, n3)) : (n2);
        System.out.println("Max ix " + max);
    }

}
