package assignment_5;
import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int n = input.nextInt();
		int a=0;
		int b=1;
		int c=1;
		System.out.print(0+","+1);
		for(int i=1;i<=n-1;i++) {
			
			System.out.print(","+c);
			a=b;
			b=c;
			c=a+b;
		}
			
		

	}

}
