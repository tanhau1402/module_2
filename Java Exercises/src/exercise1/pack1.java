package exercise1;

import java.util.Scanner;

public class pack1 {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh m : ");
        m = scanner.nextInt();
        System.out.println("nhap canh n : ");
        n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
