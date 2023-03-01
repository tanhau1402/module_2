import java.util.Scanner;

public class CountValue {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        str = scanner.nextLine();
        System.out.println("Nhap ki tu : ");
        char character;
        character = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ki tu trong chuoi la : " + count);
    }
}
