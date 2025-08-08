package JATTask5;

import java.util.Scanner;

public class PatternProgram {
	static int count=1;
	static int number;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		number= input.nextInt();
		for(int i=1; i<=number;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(count++);
				System.out.print(" ");
			}
			System.out.println("\n");
		}

	}

}
