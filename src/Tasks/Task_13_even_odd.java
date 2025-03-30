package Tasks;


public class Task_13_even_odd {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9};

        for (int n : array) {
            if (n % 2 == 0) {
                System.out.println(n + " is an even number");
            } else {
                System.out.println(n + " is an odd number");
            }

        }


    }
}
