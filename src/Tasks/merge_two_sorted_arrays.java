package Tasks;


import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;


public class merge_two_sorted_arrays {
    public static void main(String[] args) {
        int[] a = {3,1,9};
        int[] b = {5,2,8};
        
        List list1 = new ArrayList<>();
        for (int num : a) {
            list1.add(num);
        }
        
        List list2 = new ArrayList<>();
        for (int num : b) {
            list2.add(num);
        }

        List mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        System.out.println(mergedList);

        Collections.sort(mergedList);
        System.out.println(mergedList);

    }}