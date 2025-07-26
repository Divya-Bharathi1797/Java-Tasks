package JATtask4;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the Age:");
	int age=obj.nextInt();
	
	if (age<60)
	{
		System.out.println("Person is not a Senior Citizen ");
	}
	else
	{
		System.out.println("Person is Senior Citizen");
	}

	}

}
