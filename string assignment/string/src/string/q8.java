package string;
import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String concatMethodResult = str1 + str2;
        String plusOperatorResult = concatMethodResult.concat(str2);

        System.out.println("String concatenation using method: " + concatMethodResult);
        System.out.println("String concatenation using + operator: " + plusOperatorResult);

        System.out.print("Enter an index number: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= concatMethodResult.length()) {
            System.out.println("Index out of range");
        } else {
            System.out.println("Character at index " + index + ": " + concatMethodResult.charAt(index));
        }
    }

	}


