import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[]  array;
        int size;
        int value;
        int index;
       Scanner scanner = new Scanner(System.in);
        System.out.println("size of array :");
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap vao phan tu thu "+(i +1)+" :");
            array[i] = scanner.nextInt();
        }
        System.out.println("mang truoc khi chen : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }
        System.out.println("nhap pha tu can chen : ");
        value = scanner.nextInt();
        System.out.println("nhap index de chen phan tu : ");
        index = scanner.nextInt();
        for (int i = size; i > index ; i--) {
                array[i] = array[i - 1];
        }
        array[index] = value;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
