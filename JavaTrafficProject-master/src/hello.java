//Import the scanner
import java.util.Scanner;
//Creating the main class hello
public class hello {

	//Adding the function one time that contains a string
	public static void main(String[] args) {
		//Printing the first string
		System.out.println("I can add numbers for you.");
		//Getting the user input
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int x = num.nextInt();
		System.out.println("Enter the 2nd number");
		int c = num.nextInt();
		System.out.println("Enter the 3rd number");
		int f = num.nextInt();
		int sum = x+c+f;
		
		// prints the number and the sum
		System.out.println("the sum is " + sum);
		
	   		
	}
};
