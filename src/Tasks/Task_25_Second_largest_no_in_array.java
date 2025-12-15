package Tasks;

public class Task_25_Second_largest_no_in_array {
    public static void main(String[] args) {

        int[] input = {79,29,15,3,81,6,19,78,10,80};

        int firstLargest =0, secondlargest = 0;

        for(int i = 0; i<input.length;i++){
            if(input[i]> firstLargest){
                secondlargest = firstLargest;
                firstLargest = input[i];
            } else if ((input[i]> secondlargest) && (input[i]!= firstLargest)){
                secondlargest =  input[i];
            }
        }
        System.out.println(secondlargest);
    }
}
