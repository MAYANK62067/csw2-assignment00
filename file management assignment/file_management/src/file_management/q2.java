package file_management;
import java.io.*;
import java.util.Scanner;


public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File file = new File("diary.txt");

	        // Check if the file exists
	        if (!file.exists()) {
	            System.out.println("Error: The file does not exist.");
	            return;
	        }

	        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }

	}

}
