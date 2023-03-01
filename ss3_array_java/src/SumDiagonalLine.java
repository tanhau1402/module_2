import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        int step;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao bac cua ma tran vuong : ");
        step = scanner.nextInt();
        int[][] array = new int[step][step];
        System.out.println("Nhap vao cac phan tu cho ma tran : ");
        for (int i = 0; i < step; i++) {
            for (int j = 0; j < step; j++) {
                System.out.println("Array[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma tran vua nhap : ");
        for (int i = 0; i < step; i++) {
            for (int j = 0; j < step; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < step; i++) {
            for (int j = 0; j < step; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tong cac phan tu tren duong cheo  la : " + sum);
    }


}
