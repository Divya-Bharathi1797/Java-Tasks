package JATtask4;

import java.util.Scanner;

class Digitcount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();         

        String numStr = Integer.toString(number); 

        int digitCount = numStr.length();         

        System.out.println("Number of characters in " + number + " = " + digitCount); 
        

	}

}
