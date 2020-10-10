package assignment_5;

public class Question_11 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int l=0;l<i;l++) {
				System.out.print(" ");
			}

			for(int j=5-i;j>=1;j--) {
				System.out.print(j+"  ");
			}System.out.println();
		}

	}

}
