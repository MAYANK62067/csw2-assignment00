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
        return Integer.compare(this.rn, other.rn);
    }
}


public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[5];

        students[0] = new Student("John", 1, 80.0);
        students[1] = new Student("Alice", 3, 90.0);
        students[2] = new Student("Bob", 2, 70.0);
        students[3] = new Student("Eve", 4, 85.0);
        students[4] = new Student("Mike", 5, 95.0);

        System.out.println("Original Student List:");
        for (Student student : students) {
            System.out.println(student);
        }

        bubbleSort(students);

        System.out.println("Sorted Student List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }}}}

	


