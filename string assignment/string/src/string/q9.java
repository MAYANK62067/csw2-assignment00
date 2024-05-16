package string;
import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter a word to search for: ");
        String searchWord = scanner.nextLine();

        System.out.print("Enter a word to replace it with: ");
        String replaceWord = scanner.nextLine();

        int index = sentence.indexOf(searchWord);

        if (index != -1) {
            String before = sentence.substring(0, index);
            String after = sentence.substring(index + searchWord.length());
            String modifiedSentence = before + replaceWord + after;

            System.out.println("Original sentence: " + sentence);
            System.out.println("Modified sentence: " + modifiedSentence);
        } else {
            System.out.println("Search word not found in the sentence");
        }

	}

}
