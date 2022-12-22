public interface Caculator {
    public double Add(double a, double b);

    public double Subtract(double a, double b);

    public double Multi(double a, double b);

    public double Division(double a, double b);

    public class Casio implements Caculator {

        @Override
        public double Add(double a, double b) {
            return a + b;
        }

        @Override
        public double Subtract(double a, double b) {
            return a - b;
        }

        @Override
        public double Multi(double a, double b) {
            return a * b;
        }

        @Override
        public double Division(double a, double b) {
            return a / b;
        }
    }

    public class Vinacal implements Caculator {

        @Override
        public double Add(double a, double b) {
            return a + b;
        }

        @Override
        public double Subtract(double a, double b) {
            return a - b;
        }

        @Override
        public double Multi(double a, double b) {
            return a * b;
        }

        @Override
        public double Division(double a, double b) {
            return a / b;
        }
    }
    public interface SortInterface {
         public void  sortUp(double [] arr);
         public void sortDown(double[] arr);
    }

    public static void main(String[] args) {
        System.out.println("test case 1 :");
        Casio casio1 = new Casio();
        Vinacal vinacal1 = new Vinacal();
        System.out.println("5 +3 = " + casio1.Add(5,3));
        System.out.println("4 + 2 = " + vinacal1.Add(4,2));
    }
}
