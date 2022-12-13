import java.util.Scanner;

public class TransferMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Usd value : ");
        usd = scanner.nextDouble();
        double transfer = usd * vnd;
        System.out.println("Vnd value : " + transfer + "vnd");
    }
}
