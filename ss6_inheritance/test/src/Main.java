import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter shape 1 : ");
        double shape1 = sc.nextDouble();
        System.out.println("enter side 2 : ");
        double shape2 = sc.nextDouble();
        System.out.println("enter shape 3 ");
        double shape3 = sc.nextDouble();
        Shape triangle = new Triangle(shape1,shape2,shape3);
       Shape triangle2 = new Triangle("red",true,shape1,shape2,shape3);
        System.out.println(triangle2.getColor());
    }


}