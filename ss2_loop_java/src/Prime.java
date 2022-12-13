import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        int number;
        byte count = 0;
        int n = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers of primes : ");
        number = scanner.nextInt();
        while (count < number) {
            byte divisor = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) {
                count++;
                System.out.printf(n + "  ");
            }
            n++;
        }
    }
}
