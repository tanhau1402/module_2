import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int length = array1.length + array2.length;
        int[] newArray = new int[length];
        int index = 0;
        for (int element : array1) {
            newArray[index] = element;
            index++;
        }
        for (int element : array2) {
            newArray[index] = element;
            index++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
