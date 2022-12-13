import java.util.Scanner;

public class PrintRectangle {
    public static void main(String[] args) {
        System.out.println("menu");
        System.out.println("1. Print triangle");
        System.out.println("2. Print square triangle ");
        System.out.println("3. Print isosceles triangle");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your select :");
        byte select = 0;
        select = scanner.nextByte();
        switch (select) {
            case 1:
                for (int i = 1; i <= 6; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.println("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                int row = 5;
                int col = 5;
                for (int i = 0; i < row; i++) {
                    for (int j = 1; j <= col; j++) {
                        if (j < (row - i)) {
                            System.out.println("  ");
                        } else {
                            System.out.println("*  ");
                        }
                    }
                    col++;
                    System.out.println("\n");
                }
                break;
        }
    }
}
