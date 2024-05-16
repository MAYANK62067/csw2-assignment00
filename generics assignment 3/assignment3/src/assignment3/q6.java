package assignment3;
import java.util.Scanner;
import java.util.TreeSet;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Create a TreeSet of Integer type
        TreeSet<Integer> integerSet = new TreeSet<>();

        // Add elements to the TreeSet
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(40);
        integerSet.add(50);

        // Display the TreeSet
        System.out.println("TreeSet: " + integerSet);

        // Ask the user to enter a number and search for it in the TreeSet
        System.out.println("Enter a number to search:");
        int num = scanner.nextInt();
        boolean found = integerSet.contains(num);
        System.out.println("Number found: " + found);

        // Remove an element from the TreeSet
        System.out.println("Enter a number to remove:");
        int removeNum = scanner.nextInt();
        if (integerSet.contains(removeNum)) {
            integerSet.remove(removeNum);
            System.out.println("Number removed: " + removeNum);
        } else {
            System.out.println("Number not found in the TreeSet");
        }
    }


	}


