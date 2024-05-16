package string;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a base string: ");
        String baseString = scanner.nextLine();

        System.out.print("Enter the number of times to concatenate the string: ");
        int times = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        long sbStartTime = System.nanoTime();
        for (int i = 0; i < times; i++) {
            sb.append(baseString);
        }
        long sbEndTime = System.nanoTime();
        long sbTimeTaken = sbEndTime - sbStartTime;

        StringBuffer sbf = new StringBuffer();
        long sbfStartTime = System.nanoTime();
        for (int i = 0; i < times; i++) {
            sbf.append(baseString);
        }
        long sbfEndTime = System.nanoTime();
        long sbfTimeTaken = sbfEndTime - sbfStartTime;

        System.out.println("StringBuilder time taken: " + sbTimeTaken + " nanoseconds");
        System.out.println("StringBuilder final length: " + sb.length());

        System.out.println("StringBuffer time taken: " + sbfTimeTaken + " nanoseconds");
        System.out.println("StringBuffer final length: " + sbf.length());

        if (sbTimeTaken < sbfTimeTaken) {
            System.out.println("StringBuilder was faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer was faster than StringBuilder.");
        }

        if (sb.length() > sbf.length()) {
            System.out.println("StringBuilder resulted in a longer string than StringBuffer.");
        } else {
            System.out.println("StringBuffer resulted in a longer string than StringBuilder.");
        }

	}

}
