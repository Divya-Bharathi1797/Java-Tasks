package JATTask5;

import java.util.Scanner;

public class PalindromeCheck {
	
	//static String Original;
	static String Revstr="";

	public static void main(String[] args) {
		
		Scanner palindrome=new Scanner(System.in);
		System.out.println("Enter the String: " );
		String Original=palindrome.next();			
		
		
		for(int i= Original.length()-1;i>=0;i--){
			Revstr=Revstr+Original.charAt(i);				
	}		
		
		if(Original.equalsIgnoreCase(Revstr)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not a Palindrome");
		}
	}
}
		