package assignment_1;
 interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollmentDetails();
}

 class Student {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

 class Course {
    private String name;
    private String code;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}

 class Enrollment implements EnrollmentSystem {
    private Map<Student, Map<Course, Boolean>> enrollmentMap;

    public Enrollment() {
        enrollmentMap = new HashMap<>();
    }

    @Override
    public void enrollStudent(Student student, Course course) {
        if (!enrollmentMap.containsKey(student)) {
            enrollmentMap.put(student, new HashMap<>());
        }
        enrollmentMap.get(student).put(course, true);
        System.out.println("Student " + student.getName() + " has been enrolled in " + course.getName());
    }

    @Override
    public void dropStudent(Student student, Course course) {
        if (enrollmentMap.containsKey(student)) {
            enrollmentMap.get(student).remove(course);
            System.out.println("Student " + student.getName() + " has been dropped from " + course.getName());
        } else {
            System.out.println("Student not enrolled in " + course.getName());
        }
    }

    @Override
    public void displayEnrollmentDetails() {
        for (Map.Entry<Student, Map<Course, Boolean>> entry : enrollmentMap.entrySet()) {
            System.out.println("Student: " + entry.getKey().getName());
            for (Map.Entry<Course, Boolean> courseEntry : entry.getValue().entrySet()) {
                System.out.println(courseEntry.getKey().getName() + " - " + (courseEntry.getValue() ? "Enrolled" : "Not Enrolled"));
            }
        }
    }
}

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnrollmentSystem enrollmentSystem = new Enrollment();

        Student student1 = new Student("John", "123");
        Student student2 = new Student("Jane", "456");
        Course course1 = new Course("Math 101", "M101");
        Course course2 = new Course("English 102", "E102");

        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);
        enrollmentSystem.dropStudent(student1, course2);

        enrollmentSystem.displayEnrollmentDetails();

	}

}
