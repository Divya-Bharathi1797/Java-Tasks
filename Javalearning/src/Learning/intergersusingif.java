package Learning;

import java.util.Scanner;

public class intergersusingif {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a= obj.nextInt();

		System.out.println("Enter the value of b");
		int b= obj.nextInt();

		System.out.println("Enter the value of c");
		int c= obj.nextInt();

		System.out.println("Enter the value of d");
		int d= obj.nextInt();

		if(a+b>c+d)
		{
			System.out.println("From the input you have given sum of a and b is greater than sum of c and d");
		}

		if(a+b<c+d)
		{
			System.out.println("From the input you have given sum of c and d is greater than sum of a and b");
		}



	}

}
