public class MovieClass {
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

    public static class Factories {
        private String nameFactory;
        private String nameCountry;

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

    public static class Movie {
        private String nameOfMovie;
        private int productYear;
        private Factories factory;
        private double price;
        private Day showDate;

        public Movie(String nameOfMovie, int productYear, Factories factory, double price, Day showDate) {
            this.nameOfMovie = nameOfMovie;
            this.productYear = productYear;
            this.factory = factory;
            this.price = price;
            this.showDate = showDate;
        }

        public String getNameOfMovie() {
            return nameOfMovie;
        }

        public void setNameOfMovie(String nameOfMovie) {
            this.nameOfMovie = nameOfMovie;
        }

        public int getProductYear() {
            return productYear;
        }

        public void setProductYear(int productYear) {
            this.productYear = productYear;
        }

        public Factories getFactory() {
            return factory;
        }

        public void setFactory(Factories factory) {
            this.factory = factory;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Day getShowDate() {
            return showDate;
        }

        public void setShowDate(Day showDate) {
            this.showDate = showDate;
        }

        public boolean checkPrice(Movie movie) {
            return this.price < movie.price;
        }

        public String getNameFactories() {
            return this.getNameFactory();
        }

        private String getNameFactory() {
            return factory.getNameFactory();
        }

        public double disCount(double percent) {
            return this.price * (1 - percent / 100);
        }
    }

    public static void main(String[] args) {
        Day day1 = new Day(12, 4, 2022);
        Day day2 = new Day(23, 12, 2019);
        Factories factories1 = new Factories("Disney", "American");
        Factories factories2 = new Factories("Marvel", "Viet Name");
        Movie movie1 = new Movie("Heroes", 2019, factories1, 300000, day1);
        Movie movie2 = new Movie("Avatar", 2020, factories2, 100000, day2);
        System.out.println(movie1.checkPrice(movie2));
        System.out.println("ten hang san xuat phim " + movie1.getNameOfMovie() + " la : " + movie1.getNameFactories());
        System.out.println("ten hang san xuat phim " + movie2.getNameOfMovie() + " la : " + movie2.getNameFactories());
        System.out.println("gia ve phim " + movie1.getNameOfMovie() + " sau khi giam gia 30% la : " + movie1.disCount(30));
        System.out.println("gia ve phim " + movie2.getNameOfMovie() + " sau khi giam gia 50% la : " + movie1.disCount(50));

    }
}
