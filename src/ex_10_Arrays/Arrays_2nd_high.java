package ex_10_Arrays;

import java.util.Arrays;

public class Arrays_2nd_high {
    public static void main(String[] args) {
        int[] numbers ={2,3,4,5,6,7};

        Arrays.sort(numbers);

        System.out.println(numbers[numbers.length-2]);
        System.out.println(numbers[numbers.length-3]);
    }
}
