public class Student {
    private String name;
    private String className;

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student() {
        name = "John";
        className = "C02";
    }
    public Student(String name,String className) {
        this.name = name;
        this.className = className;
    }
    public String display() {
        return this.name;
    }

    public static void main(String[] args) {
        Student student = new Student("a","a09");
        student.setName("avc");
        student.display();
    }

}
