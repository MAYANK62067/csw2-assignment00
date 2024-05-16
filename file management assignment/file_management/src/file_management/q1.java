package file_management;
import java.io.*;
import java.util.Scanner;


public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String diaryEntry = "";

        File file = new File("diary.txt");
        if (file.exists()) {
            System.out.println("The file already exists. Do you want to overwrite it? (y/n)");
            char response = scanner.next().charAt(0);
            if (response != 'y') {
                System.out.println("Entry not saved.");
                return;
            }
        }

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = format.format(date);

        System.out.println("Enter your diary entry:");
        diaryEntry = scanner.nextLine();
        try (FileWriter writer = new FileWriter("diary.txt", true)) {
            writer.write(dateString + "\n");
            writer.write(diaryEntry + "\n");
            writer.write("\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Entry saved.");
    }

	}


