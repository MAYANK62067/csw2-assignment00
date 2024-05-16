package file_management;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the source file path:");
	        String sourceFilePath = scanner.nextLine();

	        System.out.println("Enter the destination file path:");
	        String destinationFilePath = scanner.nextLine();

	        File sourceFile = new File(sourceFilePath);
	        File destinationFile = new File(destinationFilePath);

	        if (!sourceFile.exists()) {
	            System.out.println("Error: The source file does not exist.");
	            return;
	        }

	        if (destinationFile.exists()) {
	            System.out.println("Destination file already exists. Do you want to overwrite it? (y/n)");
	            String response = scanner.nextLine();
	            if (!response.equalsIgnoreCase("y")) {
	                System.out.println("Copy operation cancelled.");
	                return;
	            }
	        }

	        try {
	            FileInputStream sourceFileInputStream = new FileInputStream(sourceFile);
	            FileOutputStream destinationFileOutputStream = new FileOutputStream(destinationFile);

	            byte[] buffer = new byte[1024];
	            int bytesRead;

	            while ((bytesRead = sourceFileInputStream.read(buffer)) != -1) {
	                destinationFileOutputStream.write(buffer, 0, bytesRead);
	            }

	            sourceFileInputStream.close();
	            destinationFileOutputStream.close();

	            System.out.println("File copied successfully.");
	        } catch (IOException e) {
	            System.out.println("Error: Unable to copy file. " + e.getMessage());
	        }

	}

}
