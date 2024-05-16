package assignment_1;
 class College {
    private String collegeName;
    private String collegeLoc;

    public College(String name, String location) {
        this.collegeName = name;
        this.collegeLoc = location;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }
}

 class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int id, String name, College college) {
        this.studentId = id;
        this.studentName = name;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("College Location: " + college.getCollegeLoc());
        System.out.println();
    }
}


public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College college1 = new College("ABC College", "New York");
        College college2 = new College("DEF College", "Chicago");

        Student student1 = new Student(1, "John Doe", college1);
        Student student2 = new Student(2, "Jane Smith", college2);

        System.out.println("Colleges:");
        System.out.println(college1.getCollegeName());
        System.out.println(college2.getCollegeName());
        System.out.println();

        System.out.println("Students:");
        student1.displayStudentInfo();
        student2.displayStudentInfo();

	}

}
