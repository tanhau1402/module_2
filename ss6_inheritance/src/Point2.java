import java.lang.reflect.Array;
import java.util.Arrays;

public class Point2 {
    public static class Point {
        private float x;
        private float y;

        public Point(float x, float y) {
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

    public static class MovablePoint extends Point {
        private float xSpeed;
        private float ySpeed;

        public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public float getXSpeed() {
            return xSpeed;
        }

        public void setXSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }

        public float getYSpeed() {
            return ySpeed;
        }

        public void setYSpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }

        public float[] getSpeed() {
            float[] array = {this.xSpeed, this.ySpeed};
            return array;
        }

        public Point Move() {
            this.setX(this.getX() + this.xSpeed);
            this.setY(this.getY() + this.ySpeed);
            return this;
        }

        @Override
        public String toString() {
            return super.toString() + "x speed :" + this.xSpeed + " y speed : " + this.ySpeed;
        }
    }

    public static void main(String[] args) {
        Point point = new Point(3, 4);
        MovablePoint movablePoint = new MovablePoint(3, 4, 5, 6);
        System.out.println(point.toString());
        System.out.println(Arrays.toString(point.getXy()));
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.Move());
    }
}
