package JATtask4;

import java.util.Scanner;

public class WelcometoGuvi {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	System.out.println("Enter the message");
	String value=object.nextLine();
	System.out.println("Printing the given message 10 times " );
	
	for (int i=1; i<=10; i++)
	{
		
		System.out.println( value);
	}

	}

}
