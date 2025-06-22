package opgave03;

import java.util.*;

public class College {
    private String name;
    Map<Integer,Student> students = new LinkedHashMap<>();

    public College(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addStudent(Student student) {
        students.put(student.getStudentNO(),student);
    }
    public void removeStudent(Student student) {
        students.remove(student.getStudentNO());
    }
    public double averageGrade() {
        double sum = 0;
        int count = 0;
        for (Student student : students.values()) {
            List<Integer> grades = student.getGrades();
            if (!grades.isEmpty()) {
                double studentSum = 0;
                for (int grade : grades) {
                    studentSum += grade;
                }
                double studentAvg = studentSum / grades.size();
                sum += studentAvg;
                count++;
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }

    /*public Student findStudentWithOutHashMap(int StudentNO) {
        for (Student student : students) {
            if (student.getStudentNO() == (StudentNO)) {
                return student;
            }
        }
        return null; // or throw an exception if preferred
    }*/

    public Student findStudent(int studentNO) {
        return students.get(studentNO);
    }
    public List<Student> getStudentsSortedByStudentNo() {
        List<Student> sorted = new ArrayList<>(students.values());
        sorted.sort(Comparator.comparingInt(Student::getStudentNO));
        return sorted;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
