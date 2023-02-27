import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter a size :");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20 !");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("enter elements " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list : ");
        for (int k : array) {
            System.out.print(k + " ");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println();
        System.out.println("Max element in the list is " + max + " at position " + index);
    }
}
