import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter a size :");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("size does not exceed 20 !");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("enter element " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Elements in array : ");
        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.println();
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println("New array : ");
        for (int k : array) {
            System.out.print(k + " ");
        }
    }
}
