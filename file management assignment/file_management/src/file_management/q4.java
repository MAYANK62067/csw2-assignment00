package file_management;
import java.io.*;
import java.util.*;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a directory path:");
        String directoryPath = scanner.nextLine();

        File dir = new File(directoryPath);

        if (!dir.exists()) {
            System.out.println("Error: The directory does not exist.");
            return;
        }

        if (!dir.isDirectory()) {
            System.out.println("Error: The path is not a directory.");
            return;
        }

        File[] files = dir.listFiles();
        if (files == null) {
            System.out.println("Error: Unable to list files.");
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                System.out.println("File: " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("Directory: " + file.getName());
            }
        }

	}

}
