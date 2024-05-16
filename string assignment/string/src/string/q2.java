package string;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = "Hello";
        String modifiedString = originalString + " World";

        // Print the original string
        System.out.println("Original string: " + originalString);

        // Try to modify the original string
        try {
            originalString += "!";
            System.out.println("Modified string: " + originalString);
        } catch (Exception e) {
            System.out.println("Error: Cannot modify the original string");
        }

        System.out.println("Modified string: " + modifiedString);

        StringBuilder builder = new StringBuilder(originalString);

        builder.append("!");
        System.out.println("Modified builder object: " + builder.toString());

        System.out.println("Original string after modification: " + originalString);

        System.out.println("Is the modified string equal to the original string? " + modifiedString.equals(originalString));

        System.out.println("Is the modified builder object equal to the original string? " + builder.toString().equals(originalString));

        System.out.println("Is the original string a CharSequence? " + (originalString instanceof CharSequence));

	}

}
