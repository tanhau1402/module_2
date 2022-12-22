public class ComputerManege {
    public static class Day {
        private int day;
        private int month;
        private int year;

        public Day(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    public static class Country {
        private String countryCode;
        private String countryName;

        public Country(String countryCode, String countryName) {
            this.countryCode = countryCode;
            this.countryName = countryName;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }
    }

    public static class Factories {
        private String nameFactories;
        private Country country;

        public Factories(String nameFactories, Country country) {
            this.nameFactories = nameFactories;
            this.country = country;
        }

        public String getNameFactories() {
            return nameFactories;
        }

        public void setNameFactories(String nameFactories) {
            this.nameFactories = nameFactories;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public String getNameCountry() {
            return this.country.getCountryName();
        }
    }

    public static class Computer {
        private Factories factories;
        private Day dateOut;
        private double price;
        private double time;

        public Computer(Factories factories, Day dateOut, double price, double time) {
            this.factories = factories;
            this.dateOut = dateOut;
            this.price = price;
            this.time = time;
        }

        public Factories getFactories() {
            return factories;
        }

        public void setFactories(Factories factories) {
            this.factories = factories;
        }

        public Day getDateOut() {
            return dateOut;
        }

        public void setDateOut(Day dateOut) {
            this.dateOut = dateOut;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getTime() {
            return time;
        }

        public void setTime(double time) {
            this.time = time;
        }

        public boolean checkPrice(Computer computer) {
            return this.price == computer.price;
        }

        public String getCountry() {
            return this.factories.getNameCountry();
        }
    }

    public static void main(String[] args) {
        Day day1 = new Day(12, 3, 2021);
        Day day2 = new Day(1, 12, 2018);
        Country country1 = new Country("a123", "Viet Nam");
        Country country2 = new Country("a333", "France");
        Factories factories1 = new Factories("Samsung", country1);
        Factories factories2 = new Factories("Apple", country2);
        Computer computer1 = new Computer(factories1, day1, 50000000, 23);
        Computer computer2 = new Computer(factories2, day2, 50000000, 36);
        System.out.println(computer1.checkPrice(computer2));
        System.out.println("name of country : " + computer1.getCountry());
        System.out.println("name of country : " + computer2.getCountry());
    }
}
