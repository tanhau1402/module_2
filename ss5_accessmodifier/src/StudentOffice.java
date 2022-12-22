import java.util.Objects;

public class StudentOffice {
    public static class StudentClass {
        private String className;
        private String facultyName;

        public StudentClass(String className, String facultyName) {
            this.className = className;
            this.facultyName = facultyName;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public String getFacultyName() {
            return facultyName;
        }

        public void setFacultyName(String facultyName) {
            this.facultyName = facultyName;
        }
    }

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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Day day1)) return false;
            return getDay() == day1.getDay() && getMonth() == day1.getMonth() && getYear() == day1.getYear();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getDay(), getMonth(), getYear());
        }
    }

    public static class Student {
        private String studentCode;
        private String nameOfStudent;
        private Day dayOfBirth;
        private double average;
        private StudentClass classOfStudent;

        public Student(String studentCode, String nameOfStudent, Day dayOfBirth, double average, StudentClass classOfStudent) {
            this.studentCode = studentCode;
            this.nameOfStudent = nameOfStudent;
            this.dayOfBirth = dayOfBirth;
            this.average = average;
            this.classOfStudent = classOfStudent;
        }

        public String getStudentCode() {
            return studentCode;
        }

        public void setStudentCode(String studentCode) {
            this.studentCode = studentCode;
        }

        public String getNameOfStudent() {
            return nameOfStudent;
        }

        public void setNameOfStudent(String nameOfStudent) {
            this.nameOfStudent = nameOfStudent;
        }

        public Day getDayOfBirth() {
            return dayOfBirth;
        }

        public void setDayOfBirth(Day dayOfBirth) {
            this.dayOfBirth = dayOfBirth;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public StudentClass getClassOfStudent() {
            return classOfStudent;
        }

        public void setClassOfStudent(StudentClass classOfStudent) {
            this.classOfStudent = classOfStudent;
        }

        public String getFaculty() {
            return this.classOfStudent.getFacultyName();
        }

        public String checkScore() {
            if (this.average > 5) {
                return "you pass the exam !";
            } else {
                return "you are not pass the exam 1";
            }
        }

        public boolean checkDay(Student student) {
            return this.dayOfBirth.equals(student.dayOfBirth);
        }


    }

    public static void main(String[] args) {
        Day day1 = new Day(12, 2, 2021);
        Day day2 = new Day(12, 2, 2021);
        StudentClass class1 = new StudentClass("A0922I1", "Java");
        StudentClass class2 = new StudentClass("A0322I1", "Php");
        Student student1 = new Student("1223", "Hau", day1, 8.0, class1);
        Student student2 = new Student("2311", "Nam", day2, 3, class2);
        System.out.println(student2.getFaculty());
        System.out.println("kiem tra thi dat :  " + student1.checkScore());
        System.out.println("kiem tra thi dat : " + student2.checkScore());
        System.out.println("check ngay sinh :" + student1.checkDay(student2));
    }


}
