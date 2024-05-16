package assignment3;
import java.util.LinkedList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private int mark;

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && mark == student.mark && name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Mark: " + mark;
    }
}

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> students = new LinkedList<>();

        students.add(new Student("John", 20, 80));
        students.add(new Student("Alice", 22, 90));
        students.add(new Student("Bob", 25, 70));
        students.add(new Student("Charlie", 20, 85));

        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of a student:");
        String name = scanner.nextLine();
        System.out.println("Enter the age of the student:");
        int age = scanner.nextInt();
        System.out.println("Enter the mark of the student:");
        int mark = scanner.nextInt();
        Student student = new Student(name, age, mark);

        boolean found = false;
        for (Student s : students) {
            if (s.equals(student)) {
                found = true;
                break;
            }
        }
        System.out.println("Student found: " + found);

        System.out.println("Enter the name of the student to remove:");
        String removeName = scanner.nextLine();
        System.out.println("Enter the age of the student to remove:");
        int removeAge = scanner.nextInt();
        System.out.println("Enter the mark of the student to remove:");
        int removeMark = scanner.nextInt();
        Student removeStudent = new Student(removeName, removeAge, removeMark);

        for (Student s : students) {
            if (s.equals(removeStudent)) {
                students.remove(s);
                break;
            }
        }
        System.out.println("Student removed: " + removeStudent);

        int count = students.size();
        System.out.println("Number of objects in the list: " + count);
    }


	}


