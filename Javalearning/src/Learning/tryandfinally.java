package Learning;

import java.util.Scanner;

public class tryandfinally {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		try {
			System.out.println("Enter the value:");
			int a = obj.nextInt();
			System.out.println("Entered number is " + a);
		}
		finally {
			System.out.println("This is the finally block. It always executes.");

		}
	}


	}


