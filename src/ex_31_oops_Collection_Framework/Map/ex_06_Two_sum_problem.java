package ex_31_oops_Collection_Framework.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        // if no pair found
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 11, 1,8};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length > 0) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No pair found.");
        }
    }
}