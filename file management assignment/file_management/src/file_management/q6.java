package file_management;
import java.io.File;
import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file to be deleted:");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("Error: The file does not exist.");
        } else {
            System.out.println("Are you sure you want to delete " + file.getName() + "? (y/n)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("y")) {
                if (file.delete()) {
                    System.out.println("File deleted successfully.");
                } else {
                    System.out.println("Error: Unable to delete file.");
                }
            } else {
                System.out.println("File deletion cancelled.");
            }
        }
    }
}
		


