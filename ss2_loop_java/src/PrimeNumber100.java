import java.util.Scanner;

public class PrimeNumber100 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int numb = (int) Math.sqrt(n);
        for (int i = 2; i < numb; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("numbers less than : ");
        int n = scanner.nextInt();
        System.out.println("all primes less  than " + n + "\n");
        if (n >= 2) {
            System.out.println(2);
        }
        for (int i = 3; i < n; i += 2) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
