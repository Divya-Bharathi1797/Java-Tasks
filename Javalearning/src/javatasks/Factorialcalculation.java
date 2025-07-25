package javatasks;

import java.util.Scanner;

public class Factorialcalculation {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the factorial number");
		int num= scanner.nextInt();
		long factorial=1;
		
		for(int i=num; i>=1; i--) {
			factorial *=i;
		}
		{
						
		System.out.println("The Factorial of given number is " + factorial );
			
		}
		

	}

}
