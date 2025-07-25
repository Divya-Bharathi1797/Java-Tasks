package Learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputmismatchexception {

	public static void main(String[] args) {
		try{
			Scanner obj=new Scanner(System.in);

		System.out.println("Enter the value");

		int a=obj.nextInt();
		System.out.println("Entered number is" + a);
		}
		catch(InputMismatchException a)
		{
			System.out.println("input exception error");
		}

	}

}
