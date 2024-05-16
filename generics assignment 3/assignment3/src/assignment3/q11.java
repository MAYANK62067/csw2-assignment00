package assignment3;
import java.util.HashMap;
import java.util.Map;

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : arr) {
            numMap.put(num, num);
        }

        int smallestMissing = 1;
        while (numMap.containsKey(smallestMissing)) {
            smallestMissing++;
        }

        System.out.println("Smallest positive number missing: " + smallestMissing);

	}

}
