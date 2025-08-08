package JATTask5;

public class ReverseString {
	static String OriginalStr="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String Reversestr="";

	public static void main(String[] args) {
		for(int i=OriginalStr.length()-1; i>=0;i--) {
			Reversestr=Reversestr+ OriginalStr.charAt(i);
		}
		
		System.out.println("Original String before reverse is " + OriginalStr + " and reversed String is " +Reversestr);		
		}

}
