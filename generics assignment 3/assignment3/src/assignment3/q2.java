package assignment3;
 class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// ArrayListUser class
import java.util.ArrayList;
import java.util.Collections;

 class ArrayListUser {
    private ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void printUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void sortUsers() {
        Collections.sort(users, (u1, u2) -> u1.getAge() - u2.getAge());
    }

    public void printSortedUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayListUser arrayListUser = new ArrayListUser();

	        User user1 = new User("John", 25);
	        User user2 = new User("Alice", 30);
	        User user3 = new User("Bob", 20);

	        arrayListUser.addUser(user1);
	        arrayListUser.addUser(user2);
	        arrayListUser.addUser(user3);

	        arrayListUser.printUsers();

	        arrayListUser.sortUsers();

	        arrayListUser.printSortedUsers();

	}

}}
