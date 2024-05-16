package assignment3;
import java.util.PriorityQueue;
import java.util.Queue;

public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};

        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
        }

        System.out.println("Dequeued elements:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }

	}

}
