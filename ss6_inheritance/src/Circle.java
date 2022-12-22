public class Circle {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "radius : " + this.radius + " color : " + this.color;
    }

    public static class Cylinder extends Circle {
        private int height;

        public Cylinder(int radius, String color, int height) {
            super(radius, color);
            this.height = height;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public double getVolume() {
            return this.height * getRadius() * getRadius() * 3.14;
        }

        @Override
        public String toString() {
            return "Radius : " + getRadius() + "color : " + getColor() + "height :" + getHeight();
        }
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3, "red", 14);
        Circle circle = new Circle(3, "blue");
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getVolume());
        System.out.println(circle.toString());


    }
}
