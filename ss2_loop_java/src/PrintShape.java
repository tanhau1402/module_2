import java.util.Scanner;

public class PrintShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println(" enter shape to print : ");
        System.out.println("1. Print the rectangle ");
        System.out.println("2. Print the square triangle ");
        System.out.println("3. Print isosceles triangle ");
        System.out.println("4. Exit !");
        choice = scanner.nextInt();
        if (choice == 1) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        } else if (choice == 2) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        } else if (choice == 3) {
            for (int i = 0; i < 7; i++) {
                for (int j = 7; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (choice == 4) {
            System.exit(4);
        }

    }
}
