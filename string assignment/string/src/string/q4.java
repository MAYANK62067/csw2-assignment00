package string;
import java.util.Scanner;

 class TextEditor {
    private StringBuffer text;

    public TextEditor() {
        this.text = new StringBuffer();
    }

    public void append(String str) {
        text.append(str);
    }

    public void insert(int index, String str) {
        text.insert(index, str);
    }

    public void delete(int start, int end) {
        if (start > end) {
            System.out.println("Invalid start and end indices");
            return;
        }
        text.delete(start, end + 1);
    }

    public void reverse() {
        text.reverse();
    }

    public void replace(int start, int end, String str) {
        if (start > end) {
            System.out.println("Invalid start and end indices");
            return;
        }
        text.delete(start, end + 1);
        text.insert(start, str);
    }

    public void printText() {
        System.out.println(text);
    }

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the operation (1-6):");
            System.out.println("1. Append a string");
            System.out.println("2. Insert a string at a specified index");
            System.out.println("3. Delete a portion of text");
            System.out.println("4. Reverse the text");
            System.out.println("5. Replace a portion of text");
            System.out.println("6. Print the text and exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the string to append: ");
                    String str = scanner.next();
                    editor.append(str);
                    break;
                case 2:
                    System.out.print("Enter the index: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter the string to insert: ");
                    str = scanner.next();
                    editor.insert(index, str);
                    break;
                case 3:
                    System.out.print("Enter the start index: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter the end index: ");
                    int end = scanner.nextInt();
                    editor.delete(start, end);
                    break;
                case 4:
                    editor.reverse();
                    break;
                case 5:
                    System.out.print("Enter the start index: ");
                    start = scanner.nextInt();
                    System.out.print("Enter the end index: ");
                    end = scanner.nextInt();
                    System.out.print("Enter the string to replace: ");
                    str = scanner.next();
                    editor.replace(start, end, str);
                    break;
                case 6:
                    editor.printText();
                    return;
                default:
                    System.out.println("Invalid choice");
            }

	}

}}}
