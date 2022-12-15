import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a name of student :");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("student " + input_name + " find at " + (i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("not found student " + input_name + "in the list");
        }
    }
}
