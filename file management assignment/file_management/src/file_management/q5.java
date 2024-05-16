package file_management;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class q5 {

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

	        List<File> textFiles = new ArrayList<>();

	        for (File file : dir.listFiles()) {
	            if (file.isFile() && file.getName().endsWith(".txt")) {
	                textFiles.add(file);
	            }
	        }

	        if (textFiles.isEmpty()) {
	            System.out.println("No text files found.");
	        } else {
	            System.out.println("Text files found:");
	            for (File file : textFiles) {
	                System.out.println(file.getName());
	            }

	}}}


