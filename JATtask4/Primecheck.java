package JATtask4;

import java.util.Scanner;

public class Primecheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i;
		
		if (num<=1)
		{
			System.out.println("Entered number is not Prime number");
		}
		else {
			for (i=2; i<=num;i++) {
				if (num%i==0) {
					break;
				}
			}
			if (i>num/2) {
				System.out.println("Entered number is a prime number");
			} else {
				System.out.println("Entered number is not a prime number");
			}
		}

	}

}
