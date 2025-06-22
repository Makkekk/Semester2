package opgave03;

import java.util.List;

public class Student implements Comparable<Student> {
    private int StudentNO;
    private String name;
    List<Integer> grades;

    public Student(int studentNO, String name, List<Integer> grades) {
        StudentNO = studentNO;
        this.name = name;
        this.grades = grades;
    }
    public int getStudentNO() {
        return StudentNO;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.StudentNO, other.StudentNO);
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentNO=" + StudentNO +
                ", name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}

