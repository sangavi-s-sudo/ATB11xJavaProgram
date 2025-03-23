package ex_05_for_loop;

public class Forloop_break {
    public static void main(String[] args) {
        for (int i = 2 ; i < 20 ; i ++){
            if (i == 18){
                System.out.println("You can vote");
                break;
            }
            else
            {
                System.out.println("please wait");
            }
        }
    }
}
