public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("there is no day !");
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("there is no month !");
        }
        if (year >= 0) {
            this.year = year;
        } else {
            System.out.println("there is not year !");
        }
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

    public static void main(String[] args) {
        Date date = new Date(33,1,1);
        date.setDay(23);
    }
}
