package JATtask4;

import java.util.Scanner;

public class evennumberfindwithif {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);

		System.out.println("Enter the integer");
		int num=obj.nextInt();

		if(num%2 == 0)
		{
			System.out.println("Given integer is even number");
		}

		if((num % 2 != 0))
		{
			System.out.println("Given integer is not even number");
		}

	}

}
