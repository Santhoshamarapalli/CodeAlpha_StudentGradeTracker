package Task1;

import java.util.ArrayList;
import java.util.List;

public class GradeManager {
    private List<Student> students;

    public GradeManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double calculateAverage() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (Student student : students) {
            total += student.getGrade();
        }
        return total / students.size();
    }

    public Student findTopStudent() {
        if (students.isEmpty()) {
            return null;
        }
        Student top = students.get(0);
        for (Student student : students) {
            if (student.getGrade() > top.getGrade()) {
                top = student;
            }
        }
        return top;
    }

    public Student findLowestStudent() {
        if (students.isEmpty()) {
            return null;
        }
        Student lowest = students.get(0);
        for (Student student : students) {
            if (student.getGrade() < lowest.getGrade()) {
                lowest = student;
            }
        }
        return lowest;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }
}
