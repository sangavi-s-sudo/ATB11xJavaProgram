package ex_10_Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] a = {8, 4, 2, 3, 5, 6, 7};

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length - 1; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }

// Output
        for (int n : a) {
            System.out.print(n + " ");
        }}}