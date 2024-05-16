package garbage_collection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

 class Student {
    private String name;
    private List<String> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    @Override
    protected void finalize() {
        System.out.println("Student object " + this.name + " has been successfully garbage collected.");
    }
}

class University {
    private List<WeakReference<Student>> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(new WeakReference<>(student));
    }

    public void removeStudent(Student student) {
        students.removeIf(w -> w.get() == student);
    }
}


public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University university = new University();

        Student student1 = new Student("John");
        student1.addCourse("Math");
        student1.addCourse("Science");

        Student student2 = new Student("Jane");
        student2.addCourse("English");
        student2.addCourse("History");

        university.enrollStudent(student1);
        university.enrollStudent(student2);

        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory());
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory());

        university.removeStudent(student1);
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory());
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory());

        university.removeStudent(student2);
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory());
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory());
    }

	}


