package ex_05_for_loop;

public class ForLoop_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // 0 to 49, 50 times
            if (i == 5) {
                System.out.println("ghwsb");
                continue; // skip below code, move to top
            }
            System.out.println(i);
        }
    }
}
