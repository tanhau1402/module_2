import java.util.Scanner;

public class CountStudentPassing {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter a size :");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size do not exceed 30");
            }
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter a mark for students " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("List of mark :");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }
        }
        System.out.println("The number of the students passing the exam is " + count);
    }
}
