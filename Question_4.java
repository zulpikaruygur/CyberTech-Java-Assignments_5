package assignment_5;
import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		int product,number;
		do {
			System.out.println("Please enter a number:");
			Scanner input = new Scanner(System.in);
			number = input.nextInt();
			product = number * 10;
		}while(product <=100);
		System.out.println("The loop is finished.");
	}

}
