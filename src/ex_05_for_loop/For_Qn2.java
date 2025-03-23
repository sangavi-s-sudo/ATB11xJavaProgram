package ex_05_for_loop;

public class For_Qn2 {
    public static void main(String[] args) {

        for (int naveen = 0; naveen < 3; naveen++) {
            if (naveen == 2) {
                System.out.println("navven is happy");
            }
            System.out.println("naveen is sad");
        }

        System.out.println("--------");

        for(int i=0;i<10;i++){

        }

        for (long i = 1l; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("--------");

        for (float f = 0.0f; f < 10.67; f++) {
            System.out.println("Hi,Float -> " + f);
        }

        for (int i = -1; i > -10 ; i--) {
            System.out.println(i);
        }
    }

}
