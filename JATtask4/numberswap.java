package JATtask4;

import java.util.Scanner;

public class numberswap {

	public static void main(String[] args) {
	Scanner swap=new Scanner(System.in);

	System.out.println("Enter the 1st number a:");
	int a=swap.nextInt();

	System.out.println("Enter the 2nd number b:");
	int b=swap.nextInt();

	System.out.println(" Numbers before swapping a: " + a + " b: " + b);


	int c;
	 c=a;
	 a=b;
	 b=c;

	 System.out.println(" Numbers after swapping a: " + a + " b: " + b);


	}

}
