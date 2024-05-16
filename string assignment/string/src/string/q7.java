package string;
import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        char[] charArray = str.toCharArray();

        System.out.print("Enter a character to search: ");
        char c = scanner.next().charAt(0);

        int firstOccurrence = -1;
        int lastOccurrence = -1;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }

        if (firstOccurrence != -1) {
            System.out.println("First occurrence of '" + c + "' at position " + firstOccurrence);
            System.out.println("Last occurrence of '" + c + "' at position " + lastOccurrence);
        } else {
            System.out.println("Character not found in the string");
        }

        System.out.println("Character array: " + String.valueOf(charArray));
    }


	}


