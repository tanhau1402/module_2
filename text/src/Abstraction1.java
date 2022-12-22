public class Abstraction1 {
    public static class Factories {
        private String nameFactory, nameCountry;

        public Factories(String nameFactory, String nameCountry) {
            this.nameFactory = nameFactory;
            this.nameCountry = nameCountry;
        }

        public String getNameFactory() {
            return nameFactory;
        }

        public void setNameFactory(String nameFactory) {
            this.nameFactory = nameFactory;
        }

        public String getNameCountry() {
            return nameCountry;
        }

        public void setNameCountry(String nameCountry) {
            this.nameCountry = nameCountry;
        }
    }

    public abstract static class Vehicle {
        protected String nameVehicle;
        protected Factories nameFactories;

        public Vehicle(String nameVehicle, Factories nameFactories) {
            this.nameVehicle = nameVehicle;
            this.nameFactories = nameFactories;
        }

        public String getNameVehicle() {
            return nameVehicle;
        }

        public void setNameVehicle(String nameVehicle) {
            this.nameVehicle = nameVehicle;
        }

        public Factories getNameFactories() {
            return nameFactories;
        }

        public void setNameFactories(Factories nameFactories) {
            this.nameFactories = nameFactories;
        }

        public String getFactory() {
            return this.nameFactories.getNameFactory();
        }

        public void Start() {
            System.out.println("start");
        }

        public void Nitro() {
            System.out.println("nitro");
        }

        public void Stop() {
            System.out.println("Stop");
        }

        public abstract double getSpeed();
    }

    public static class Airplane extends Vehicle {
        protected String petro;

        public Airplane(String petro, Factories nameFactories) {
            super("airplane", nameFactories);
            this.petro = petro;
            this.nameFactories = nameFactories;
        }

        @Override
        public double getSpeed() {
            return 500;
        }

        public String getPetro() {
            return petro;
        }

        public void setPetro(String petro) {
            this.petro = petro;
        }

        public void takeOff() {
            System.out.println("take off ");
        }

        public void landing() {
            System.out.println("landing");
        }
    }

    public static class Oto extends Vehicle {
        protected String petro;

        public Oto(String petro, Factories nameFactories) {
            super("oto", nameFactories);
            this.petro = petro;
            this.nameFactories = nameFactories;
        }

        @Override
        public double getSpeed() {
            return 50;
        }

        public String getPetro() {
            return petro;
        }

        public void setPetro(String petro) {
            this.petro = petro;
        }
    }

    public static class Bike extends Vehicle {

        public Bike(Factories nameFactories) {
            super("bike", nameFactories);
            this.nameFactories = nameFactories;
        }

        @Override
        public double getSpeed() {
            return 20;
        }
    }

    public static void main(String[] args) {
        Factories factories1 = new Factories("Toyota", "VietNam");
        Factories factories2 = new Factories("Honda", "Japan");
        Factories factories3 = new Factories("Vin fast", "VietNam");
        Vehicle vehicle1 = new Airplane("xang", factories1);
        Vehicle vehicle2 = new Oto("dau", factories2);
        Vehicle vehicle3 = new Bike(factories3);
        System.out.println("ten hang san xuat : ");
        System.out.println(vehicle1.getFactory());
        System.out.println(vehicle2.getFactory());
        System.out.println(vehicle3.getFactory());
        System.out.println("lay van toc : ");
        System.out.println(vehicle1.getSpeed());
        System.out.println(vehicle2.getSpeed());
        System.out.println(vehicle3.getSpeed());
    }
}
