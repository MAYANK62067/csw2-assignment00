package file_management;
import java.io.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String diaryEntry = "";

        File file = new File("diary.txt");
        if (!file.exists()) {
            System.out.println("Error: The file does not exist.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             FileWriter writer = new FileWriter(file, true)) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }

            System.out.println("Enter your new diary entry:");
            diaryEntry = scanner.nextLine();
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = format.format(date);
            writer.write("\n");
            writer.write(dateString + "\n");
            writer.write(diaryEntry + "\n");
            writer.write("\n");

        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }

	}


