import java.util.*;

public class Student {
    private String _name;
    private int _course;

    public Student(String name, int course) {
        this._name = name;
        this._course = course;
    }

    public String getName() {
        return _name;
    }
    public int getCourse() {
        return _course;
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
        List<Student> listOfStudents = new ArrayList<Student>();
        listOfStudents.add(new Student("StudentCourse1", 1));
        listOfStudents.add(new Student("StudentCourse2", 2));
        listOfStudents.add(new Student("StudentCourse1", 1));
        listOfStudents.add(new Student("StudentCourse3", 3));
        listOfStudents.add(new Student("StudentCourse4", 4));
        listOfStudents.add(new Student("StudentCourse2", 2));
        listOfStudents.add(new Student("StudentCourse4", 4));
        listOfStudents.add(new Student("StudentCourse3", 3));

        printStudents(listOfStudents, 4);
    }
}
