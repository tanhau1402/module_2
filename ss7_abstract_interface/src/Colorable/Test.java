package Colorable;

public class Test {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(x,"blue",true);
        shapes[1] = new Rectangle(x,x,"red",false);
    }
}
