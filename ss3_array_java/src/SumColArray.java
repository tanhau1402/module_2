import java.util.Scanner;

public class SumColArray {
    public static void main(String[] args) {
        int m, n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua ma tran :");
        m = scanner.nextInt();
        System.out.println("Nhap vao so cot cua ma tran : ");
        n = scanner.nextInt();
        int[][] array = new int[m][n];
        System.out.println("Nhap vao cac phan tu cua ma tran : ");
        {
            int i = 0;
            while (i < m) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Array[" + i + "][" + j + "] = ");
                    array[i][j] = scanner.nextInt();
                }
                i++;
            }
        }
        System.out.println("Ma tran vua nhap : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Nhap vao cot can tinh tong : ");
        int choice = scanner.nextInt();
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j == choice) {
                            sum += array[i][j];
                        }
                    }
                }
                System.out.println("sum  col " + choice + " = " + sum);
        }

    }



