package ex_05_for_loop;

public class For_Qn3 {
    public static void main(String[] args) {
        int i = 10;
        for (; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("+++++++++++++++++++++");
        for (short n = 0 ; n < 51 ; n++){
            if (n%2 == 0){
                System.out.println(n + " is even number");
            }
            else
                System.out.println(n + " is odd number");
        }
        System.out.println("+++++++++++++++++++++");
        for (int j = 0; j <= 50 ; j++) { // 0 to 50, 51 Times
            if(j%2 ==0){
                System.out.println("Even -> "+j);
                continue;
            }
            System.out.println("Odd -> "+j);
        }
    }
    }
