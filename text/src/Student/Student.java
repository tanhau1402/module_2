package Student;

public class Student {
    private String code;
    private String name;
    private int yearOfBirth;
    private float average;

    public Student(String code, String name, int yearOfBirth, float average) {
        this.code = code;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.average = average;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }
}
