import java.util.Scanner;

public class PrintRectangle {
    public static void main(String[] args) {
        System.out.println("menu");
        System.out.println("1. Print rectangle");
        System.out.println("2. Print square triangle ");
        System.out.println("3. Print isosceles triangle");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your select :");
        byte select = 0;
        select = scanner.nextByte();
        switch (select) {
            case 1:
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= 6; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println("");
                }
                break;


            case 2:

                for (int i = 1; i <= 6; ++i) {
                    for (int j = 1; j <= i; ++j) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 6; i >= 1; --i) {
                    for (int j = 1; j <= i; ++j) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
        }
    }
}
