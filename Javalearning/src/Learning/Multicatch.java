package Learning;

import java.util.InputMismatchException;

public class Multicatch {

	public static void main(String[] args) {

		try {

		int a=10;
		int b=0;
		int c=a/b;

		String value="Java";
		System.out.println(value.charAt(2));

		int arr[]= {1,2,3,4,8};
		System.out.println(arr[5]);
		}
		catch (IndexOutOfBoundsException ie)
		{
			System.out.println("Index out of Bound Exception");
		}
		catch (InputMismatchException ss)
		{
			System.out.println("Input mismatch exception");
		}
		catch(NullPointerException ne)
		{
			System.out.println("null pointer");
		}
		catch (Exception e)
		{
			System.out.println("other exception");
		}

	}

}
