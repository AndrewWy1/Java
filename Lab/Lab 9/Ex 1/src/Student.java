import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 1));
        students.add(new Student("Emily", 4));
        students.add(new Student("Mark", 1));
        students.add(new Student("Jane", 3));
        students.add(new Student("Tom", 2));
        students.add(new Student("Lucy", 1));
        students.add(new Student("David", 3));
        students.add(new Student("Sarah", 2));
        students.add(new Student("Peter", 1));
        students.add(new Student("Mary", 3));
        students.add(new Student("Emmanuel", 4));
        students.add(new Student("Varden", 4));
        students.add(new Student("Vail", 1));
        students.add(new Student("Nikolai", 3));
        students.add(new Student("Uriel", 4));
        students.add(new Student("Pace", 2));
        students.add(new Student("Jorge", 3));
        students.add(new Student("Tyson", 2));
        students.add(new Student("Salvatore", 4));
        students.add(new Student("Yeshua", 2));

        System.out.println("Students in course 1:");
        printStudents(students, 1);

        System.out.println("\nStudents in course 2:");
        printStudents(students, 2);

        System.out.println("\nStudents in course 3:");
        printStudents(students, 3);

        System.out.println("\nStudents in course 4:");
        printStudents(students, 4);
    }
}
