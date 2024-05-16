package assignment_2;
 class Student {
    private String name;
    private Object rollNumber; 
    private int age;

    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public Student(String name, String rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Object getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }
}


public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("John", 101, 18);
        Student student2 = new Student("Jane", "102", 19);

        student1.displayDetails();
        System.out.println();
        student2.displayDetails();

	}

}
