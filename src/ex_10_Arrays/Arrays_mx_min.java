package ex_10_Arrays;

public class Arrays_mx_min {
    public static void main(String[] args) {

        int[] input = {2, 34, 56, 7, 77, 88, 10};
        int max = input[0];
        for (int i = 1; i < input.length; i++) {

            if (max < input[i]) {
                max = input[i];
            }
        }
        System.out.println(max);
    }
}
