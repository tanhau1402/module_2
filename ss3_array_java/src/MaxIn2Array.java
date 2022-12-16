import java.lang.reflect.Array;
import java.util.Scanner;

public class MaxIn2Array {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua ma tran :");
        m = scanner.nextInt();
        System.out.println("Nhap vao so cot cua ma tran :");
        n = scanner.nextInt();
        int[][] array = new int[m][n];
        System.out.println("Nhap cac phan tu cho ma tran : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Array[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }

        }
        int max = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

        }
        System.out.println("Phan tu lon nhat trong ma tran la : " + max);
    }
}
