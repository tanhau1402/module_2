import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class DeleteElement {
    public static void main(String[] args) {
        int array[] = {1, 3, 5, 6, 7, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap phan tu can xoa : ");
        int deleteElement = scanner.nextInt();
        int indexToDelete = findIndex(array, deleteElement);
        if (indexToDelete == -1) {
            System.out.println("Phan tu khong o trong mang");
        } else {
            array = deleteElement(array, indexToDelete);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static int findIndex(int[] array, int element) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
            }
        }
        return index;
    }

    static int[] deleteElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }
        return newArray;
    }
}
