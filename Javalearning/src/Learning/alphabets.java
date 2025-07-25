package Learning;

import java.util.Scanner;

public class alphabets {

	public static void main(String[] args) {
		Scanner alpha=new Scanner(System.in);

		System.out.println("Press enter to display the alphbets from A to Z");
		alpha.nextLine();

		 for (char c = 'A'; c <= 'Z'; c++) {
	            System.out.print(c + " "); // to give space after each character

		}


	}

}
