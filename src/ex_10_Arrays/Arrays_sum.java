package ex_10_Arrays;

public class Arrays_sum {
    public static void main(String[] args) {


        int[] sum_arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int n : sum_arrays) {
            sum = sum + n;
        }
        System.out.println(sum);
    }

}
