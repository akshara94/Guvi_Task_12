package Task11_pgm;

import java.util.Scanner;

	public class Q4_thrown {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the first number: ");
	        
	        int firstNumber = scanner.nextInt();
	        
	        System.out.print("Enter the second number: ");
	        int secondNumber = scanner.nextInt();
	        
	        try {
	            int result = firstNumber / secondNumber;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}
