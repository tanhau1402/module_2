public class Form {
    public class Coordinates {
        int x, y;

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public abstract class Image {
        protected Coordinates coordinates;

        public Image(Coordinates coordinates) {
            this.coordinates = coordinates;
        }

        public Coordinates getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
        }
    }

    public class Point extends Image {

        public Point(Coordinates coordinates) {
            super(coordinates);
        }
    }

    public class Circle extends Image {
        private double r;
        public Circle(Coordinates coordinates,double r) {
            super(coordinates);
            this.r = r;
        }
        public double getR() {
            return r;
        }

        public void setR(double r) {
            this.r = r;
        }
        public class Rectangle extends Image {
            private double width,length;

            public Rectangle(Coordinates coordinates, double width, double length) {
                super(coordinates);
                this.width = width;
                this.length = length;
            }

            public double getWidth() {
                return width;
            }

            public void setWidth(double width) {
                this.width = width;
            }

            public double getLength() {
                return length;
            }

            public void setLength(double length) {
                this.length = length;
            }
        }
    }

    public void main(String[] args) {
            Coordinates td1 = new Coordinates(5,5);
            Coordinates td2 = new Coordinates(3,4);
            Coordinates td3 = new Coordinates(2,2);
    }
}
