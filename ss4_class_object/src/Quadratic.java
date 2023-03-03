import java.util.Scanner;

public class Quadratic {
    double a, b, c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant()) / 2 * a);
    }

    public double getRoot2() {
        return
                (-b - Math.sqrt(getDiscriminant()) / 2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = scanner.nextDouble();
        System.out.println("enter b :");
        double b = scanner.nextDouble();
        System.out.println("enter c : ");
        double c = scanner.nextDouble();
        Quadratic result = new Quadratic(a, b, c);
        if (result.getDiscriminant() > 0) {
            System.out.println("root 1 :" + result.getRoot1()
                    + " root 2 : " + result.getRoot2());
        } else if (result.getDiscriminant() == 0) {
            System.out.println("has two root = " + result.getRoot1());
        } else {
            System.out.println("no root");
        }
    }
}
