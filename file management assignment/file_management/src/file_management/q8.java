package file_management;
import java.io.File;
import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the current file name:");
	        String currentFileName = scanner.nextLine();

	        System.out.println("Enter the new file name:");
	        String newFileName = scanner.nextLine();

	        File file = new File(currentFileName);

	        if (!file.exists()) {
	            System.out.println("Error: The file does not exist.");
	            return;
	        }

	        File newFile = new File(file.getParent(), newFileName);

	        if (newFile.exists()) {
	            System.out.println("Error: The new file name already exists.");
	            return;
	        }

	        if (file.renameTo(newFile)) {
	            System.out.println("File renamed successfully.");
	            System.out.println("Original file name: " + currentFileName);
	            System.out.println("New file name: " + newFileName);
	        } else {
	            System.out.println("Error: Unable to rename file.");
	        }

	}

}
