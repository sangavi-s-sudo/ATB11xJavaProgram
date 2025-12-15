package Tasks;

import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int[] input = {3,5,1,4,0,2,6};
        int target = 9;

        for(int i =0; i< input.length;i++){
            for(int j=1;j< input.length;j++){
                if (input[i]+input[j]==target){
                    int[] out = {i,j};
                    System.out.println(Arrays.toString(out));

                }

            }
        }
    }
}
