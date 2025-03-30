package ex_10_Arrays.ex_11_2DArrays;

public class TwoD_Arrays {
    public static void main(String[] args) {
        int[][] array_2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] array_new1 = new int[3][3];
        array_new1[0][0] = 1;
        array_new1[0][1] = 2;
        array_new1[0][2] = 3;
        array_new1[1][0] = 4;
        array_new1[1][1] = 5;
        array_new1[1][2] = 6;
        array_new1[2][0] = 7;
        array_new1[2][1] = 8;
        array_new1[2][2] = 9;


        for (int i = 0 ; i < array_2D.length ; i ++){
            for (int j = 0 ; j <array_2D[i].length; j ++){
                System.out.print(array_2D[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
