import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] array = new int[10];
        int atIndex = 1;
        int value = 9;
        int n = 5;
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        System.out.println("Truoc khi chen : ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = n; i > atIndex; i--) {
            array[i] = array[i - 1];
        }
        array[atIndex] = value;
        System.out.println("Sau khi chen : ");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

}
