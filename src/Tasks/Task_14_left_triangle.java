package Tasks;

public class Task_14_left_triangle {
    public static void main(String[] args) {
        //print this pattern
//       ***
//       **
//       *

        int n =3;

        for(int i =0; i<n; i++){
            for (int j =n; j>i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
