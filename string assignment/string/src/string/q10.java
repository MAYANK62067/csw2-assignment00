package string;
import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Search for an index");
            System.out.println("5. Concatenate with another string");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    str = str.toLowerCase();
                    System.out.println("String after converting to lowercase: " + str);
                    break;
                case 2:
                    str = str.toUpperCase();
                    System.out.println("String after converting to uppercase: " + str);
                    break;
                case 3:
                    System.out.print("Enter a character to search for: ");
                    String searchChar = scanner.next();
                    int index = str.indexOf(searchChar);
                    if (index != -1) {
                        System.out.println("Character found at index " + index);
                    } else {
                        System.out.println("Character not found in the string");
                    }
                    break;
                case 4:
                    System.out.print("Enter an index to search for: ");
                    int searchIndex = scanner.nextInt();
                    if (searchIndex >= 0 && searchIndex < str.length()) {
                        System.out.println("Character found at index " + searchIndex);
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case 5:
                    System.out.print("Enter another string to concatenate: ");
                    String anotherStr = scanner.next();
                    str += anotherStr;
                    System.out.println("String after concatenation: " + str);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

	}

}
