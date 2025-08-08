package JATTask5;

import java.util.Scanner;

public class HotelTarrif {
	
	static int month;
	static float rent;
	static int staydays;
	static float tarrif;	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number");
		month =sc.nextInt();
		System.out.println("Enter the Room Rent amount");
		rent=sc.nextFloat();
		System.out.println("Enter the number of stay days");
		staydays=sc.nextInt();		
		
		switch(month){
			case 4: case 5: case 6: case 11: case 12:
				tarrif = rent * 1.2f * staydays;
				System.out.println(tarrif);
				break;
		default:
			tarrif= rent * staydays;
			System.out.println(tarrif);
	}		

	}
}
