package Tasks;

public class Prime_number_6 {
    public static void main(String[] args) {
        int n = 99;
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");

        } else {
            System.out.println(n + " is not a prime number");
        }

    }
}
