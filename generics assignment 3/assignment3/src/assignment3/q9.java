package assignment3;
import java.util.HashSet;
import java.util.Set;


public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 2, 4, 5, 6, 2, 7};
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println(num + " is a repeating integer.");
            } else {
                set.add(num);
            }
        }

	}

}
