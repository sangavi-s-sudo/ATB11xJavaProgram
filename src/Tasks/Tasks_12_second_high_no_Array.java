package Tasks;

public class Tasks_12_second_high_no_Array {
    public static void main(String[] args) {
        int[] array = {11, 2, 3, 4, 11, 5, 6, 13, 3,12};
        int second_largest = 0;
        int first_largest = 0;

        for (int n : array) {
            if (first_largest < n) {
                second_largest = first_largest;
                first_largest = n;
            }
            else if (first_largest>n){
                second_largest = n;
            }

        }
        System.out.println(second_largest);
    }
}
