package Tasks;

public class Task_13_RIgnt_triangle_pattern {
    public static void main(String[] args) {
        //print this pattern
//        *
//        **
//        ***
//        ****
//        *****

        int n = 4;
        for (int i = 0 ; i<n ; i ++){
            for (int j=0; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
