public class Book {
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

    public static class Author {
        private String name;
        private Day dayOfBirth;

        public Author(String name, Day dayOfBirth) {
            this.name = name;
            this.dayOfBirth = dayOfBirth;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Day getDayOfBirth() {
            return dayOfBirth;
        }

        public void setDayOfBirth(Day dayOfBirth) {
            this.dayOfBirth = dayOfBirth;
        }
    }

    public static class BookOf {
        private String nameOfBook;
        private double price;
        private int year;
        private Author author;

        public BookOf(String nameOfBook, double price, int year, Author author) {
            this.nameOfBook = nameOfBook;
            this.price = price;
            this.year = year;
            this.author = author;
        }

        public String getNameOfBook() {
            return nameOfBook;
        }

        public void setNameOfBook(String nameOfBook) {
            this.nameOfBook = nameOfBook;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public String displayName() {
            System.out.println(this.nameOfBook);
            return null;
        }

        public boolean checkYear(BookOf newBook) {
            return this.year == newBook.year;
        }

        public double disCourt(double percent) {
            return this.price * (1 - percent / 100);
        }
    }

    public static void main(String[] args) {
        Day day1 = new Day(11, 2, 2022);
        Day day2 = new Day(13, 3, 2023);
        Author author1 = new Author("Nam", day1);
        Author author2 = new Author("Hau", day2);
        BookOf book = new BookOf("Java", 230000, 2011, author1);
        BookOf book2 = new BookOf("Php", 243000, 2011, author2);
        // System.out.println(book.checkYear(book2));
        System.out.println("Gia sach " + book.getNameOfBook() + " sau khi giam 30% :" + book.disCourt(30));
        System.out.println("Gia sach " + book2.getNameOfBook() + " sau khi giam 50% :" + book2.disCourt(50));
    }
}
