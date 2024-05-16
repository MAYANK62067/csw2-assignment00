package string;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String literal = "Hello";
        String newString = new String("Hello");

        System.out.println("Memory usage for literal: " + Runtime.getRuntime().totalMemory());
        System.out.println("Memory usage for newString: " + Runtime.getRuntime().totalMemory());

        System.out.println("Memory address of literal: " + System.identityHashCode(literal));
        System.out.println("Memory address of newString: " + System.identityHashCode(newString));

        System.out.println("Are the strings equal? " + (literal == newString));
        System.out.println("Are the strings equal? " + (literal.equals(newString)));

        try {
            ((StringBuilder) newString).append(" World");
            System.out.println("Modified string: " + newString);
        } catch (Exception e) {
            System.out.println("Error: Cannot modify the string created using the new keyword");

	}

}}
