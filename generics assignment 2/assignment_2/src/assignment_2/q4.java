package assignment_2;
 class Student implements Comparable<Student> {
    private String name;
    private int rn;
    private double totalMark;

    public Student(String name, int rn, double totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRn() {
        return rn;
    }

    public double getTotalMark() {
        return totalMark;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rn + ", Total Mark: " + totalMark;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.totalMark, this.totalMark);
    }
}


public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[5];

        students[0] = new Student("John", 1, 80.0);
        students[1] = new Student("Alice", 2, 90.0);
        students[2] = new Student("Bob", 3, 70.0);
        students[3] = new Student("Eve", 4, 85.0);
        students[4] = new Student("Mike", 5, 95.0);

        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Searching for a student with a total mark of 85.0...");
        Student targetStudent = null;
        for (Student student : students) {
            if (student.compareTo(new Student("", 0, 85.0)) == 0) {
                targetStudent = student;
                break;
            }
        }

        if (targetStudent != null) {
            System.out.println("Found student: " + targetStudent);
        } else {
            System.out.println("Student not found.");
        }

	}

}
