import java.util.Arrays;

public class Point {
    public static class Point2D {
        private float x;
        private float y;

        public Point2D(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public void Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public void Point() {

        }

        public void setXy(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float[] getXy() {
            float[] array = {this.x, this.y};
            return array;
        }

        public String toString() {
            return " x :" + this.x + " y : " + this.y;
        }
    }

    public static class Point3D extends Point2D {
        private float z;

        public Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        @Override
        public float[] getXy() {
            float[] array = {this.getX(), this.getY(), this.z};
            return array;
        }

        @Override
        public String toString() {
            return super.toString() + " Z : " + this.z;
        }
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 4);
        Point3D point3D = new Point3D(3, 4, 5);
        System.out.println(point2D.toString());
        System.out.println(Arrays.toString(point2D.getXy()));
        System.out.println(point3D.toString());
        System.out.println(Arrays.toString(point3D.getXy()));
    }
}
