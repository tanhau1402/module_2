public class TestCircle {
    private double radius;
    private String color;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Circle(double radius, String color) {
        radius = 1.0;
        color = "red";
    }
    public void Circle() {
    }
    public void Circle(double radius) {
       this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return this.radius* this.radius * 3.14;
    }

    public static void main(String[] args) {

    }
}
