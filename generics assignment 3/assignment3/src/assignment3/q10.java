package assignment3;
import java.util.HashMap;
import java.util.Map;


public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "hello world hello world hello world hello";
	        Map<String, Integer> wordFrequency = new HashMap<>();

	        String[] words = str.split(" ");

	        for (String word : words) {
	            word = word.toLowerCase(); // convert to lowercase
	            if (wordFrequency.containsKey(word)) {
	                wordFrequency.put(word, wordFrequency.get(word) + 1);
	            } else {
	                wordFrequency.put(word, 1);
	            }
	        }

	        int maxFrequency = 0;
	        String mostOccurringWord = "";

	        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
	            if (entry.getValue() > maxFrequency) {
	                maxFrequency = entry.getValue();
	                mostOccurringWord = entry.getKey();
	            }
	        }

	        System.out.println("Most occurring word: " + mostOccurringWord);
	        System.out.println("Frequency: " + maxFrequency);
	    }

	}


