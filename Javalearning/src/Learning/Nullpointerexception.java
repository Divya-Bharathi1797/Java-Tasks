package Learning;

public class Nullpointerexception {

	public static void main(String[] args) {

		try{
			String a=null;

        System.out.println(a.charAt(1));
		}
		catch(NullPointerException ne) {
			System.out.println("null pointer exception");
		}
		System.out.println("hello");
	}



}
