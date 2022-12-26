package Resizeable;

public class Test {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(x, "blue", false);
        shapes[1] = new Rectangle(x, x, "red", true);
        for (Shape a : shapes) {
            System.out.println(a);
        }
        for (Shape a : shapes) {
            a.resize(Math.random() * 1000);
        }
        System.out.println();
        Shape.printShape(shapes);
    }
}
