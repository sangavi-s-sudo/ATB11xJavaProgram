package Tasks;

public class Prime_number_6 {
    public static void main(String[] args) {
        int c = 27;
        boolean isPrime = true;

        for (int i = 2; i < c; i++) {
            if (c % i == 0) {
                isPrime = false;
                System.out.println(c + " is not a prime number");
                break;
            }
        }

        if (isPrime && c > 1) {
            System.out.println(c + " is a prime number");
        }
    }
}
