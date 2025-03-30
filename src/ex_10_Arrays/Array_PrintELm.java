package ex_10_Arrays;

public class Array_PrintELm {
    public static void main(String[] args) {
        int[] marks = {2,3,4,5,6};

        for (int i = 0; i < marks.length; i ++){
            System.out.println(marks[i]);
        }

        System.out.println("____________");

        // using for each loop

        for (int n : marks){
            System.out.println(n);
        }
    }
}
