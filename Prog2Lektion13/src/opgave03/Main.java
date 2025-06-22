package opgave03;

import java.util.*;

public class Main {
    public static void main(String[] args) {

                College college = new College("Test College");

                //Test af comparator
                List<Student> students = new ArrayList<>();

                Student s1 = new Student(2, "Alice", Arrays.asList(80, 90, 100));  // avg 90
                Student s2 = new Student(3, "Bob", Arrays.asList(70, 80));         // avg 75
                Student s3 = new Student(1, "Charlie", Collections.emptyList());   // no grades

                students.add(s1);
                students.add(s2);
                students.add(s3);

                college.addStudent(s1);
                college.addStudent(s2);
                college.addStudent(s3);

        System.out.println("Sorted college students by studentNo:");
        for (Student s : college.getStudentsSortedByStudentNo()) {
            System.out.println(s);
        }

                System.out.println("Average grade (should be 82.5): " + college.averageGrade());



        System.out.println("Find student with ID 1: " + college.findStudent(1)); // should print Alice

                college.removeStudent(s2);
                System.out.println("Average grade after removing Bob (should be 90): " + college.averageGrade());

                College emptyCollege = new College("Empty");
                System.out.println("Average grade with no students (should be 0): " + emptyCollege.averageGrade());

                College noGradesCollege = new College("No Grades");
                noGradesCollege.addStudent(new Student(4, "Dave", Collections.emptyList()));
                System.out.println("Average grade with students but no grades (should be 0): " + noGradesCollege.averageGrade());
            }
        }
