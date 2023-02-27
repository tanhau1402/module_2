package Student;

import java.util.ArrayList;

public class ArrayStudent {
    private ArrayList<Student> array;
    ArrayStudent() {
        this.array = new ArrayList<Student>();
    }

    public ArrayStudent(ArrayList<Student> array) {
        this.array = array;
    }
    public void addStudent(Student student) {
        this.array.add(student);
    }
}
