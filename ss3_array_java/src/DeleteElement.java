import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter element to delete : ");
        int deleteElement = scanner.nextInt();
        int indexToDelete = findIndex(array, deleteElement);
        if (indexToDelete == -1) {
            System.out.println("Not find element !");
        } else {
            array = deleteElement(array, indexToDelete);
        }
        for (int j : array) {
            System.out.print(j + " ");
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
        if (index >= 0) System.arraycopy(array, 0, newArray, 0, index);
        if (array.length - (index + 1) >= 0)
            System.arraycopy(array, index + 1, newArray, index + 1 - 1, array.length - (index + 1));
        return newArray;
    }
}
