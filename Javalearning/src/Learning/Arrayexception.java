package Learning;

public class Arrayexception {

	public static void main(String[] args) {

		try{
			int a[]= {1,2,3,4};
		System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("incorrect index number");
		}
	}


	}


