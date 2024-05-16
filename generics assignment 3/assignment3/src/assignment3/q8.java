package assignment3;
import java.util.HashMap;
import java.util.Map;
public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "listen";
	        String str2 = "silent";

	        if (areAnagrams(str1, str2)) {
	            System.out.println("The two strings are anagrams.");
	        } else {
	            System.out.println("The two strings are not anagrams.");
	        }
	    }

	    public static boolean areAnagrams(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        Map<Character, Integer> charCountMap = new HashMap<>();

	        for (int i = 0; i < str1.length(); i++) {
	            char ch1 = str1.charAt(i);
	            char ch2 = str2.charAt(i);

	            if (ch1 == ch2) {
	                charCountMap.put(ch1, charCountMap.getOrDefault(ch1, 0) + 1);
	            } else {
	                if (!charCountMap.containsKey(ch1)) {
	                    charCountMap.put(ch1, 1);
	                } else {
	                    charCountMap.put(ch1, charCountMap.get(ch1) + 1);
	                }

	                if (!charCountMap.containsKey(ch2)) {
	                    charCountMap.put(ch2, 1);
	                } else {
	                    charCountMap.put(ch2, charCountMap.get(ch2) + 1);
	                }
	            }
	        }

	        for (int i = 0; i < str1.length(); i++) {
	            char ch = str1.charAt(i);
	            if (!charCountMap.containsKey(ch) || charCountMap.get(ch) != 0) {
	                return false;
	            }
	        }

	        return true;

	}

}
