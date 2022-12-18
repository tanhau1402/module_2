import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {
        String str;
        char character = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi ki tu : ");
        str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ki tu " + character + " trong chuoi " + str + " la " + count + " lan");
    }
}
