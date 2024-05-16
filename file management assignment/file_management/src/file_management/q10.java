package file_management;
import java.io.File;
import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the directory path:");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists()) {
            System.out.println("Error: The directory does not exist.");
            return;
        }

        if (!directory.isDirectory()) {
            System.out.println("Error: The path is not a directory.");
            return;
        }

        listFilesAndDirectories(directory, 0);

        scanner.close();
    }

    public static void listFilesAndDirectories(File directory, int indent) {
        System.out.print(getIndent(indent) + directory.getName());

        if (directory.isDirectory()) {
            System.out.println("/");
        } else {
            System.out.println();
        }

        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                listFilesAndDirectories(file, indent + 1);
            } else {
                System.out.print(getIndent(indent + 1) + file.getName());
                System.out.println();
            }
        }

	}

}
