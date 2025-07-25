package Learning;
class oddnumberexception extends Exception{
	oddnumberexception(String msg){
		System.out.println(msg);
}

public class customexception {

	public static void main(String[] args) {
		try {
			number(12);
		}
	catch(oddnumberexception oe) {
		System.out.println(oe);
	}
	}
}

public static void number(int num) throws oddnumberexception {
	if (num%2 !=0) {
		throw new oddnumberexception ("odd number");
			}
	else {
		System.out.println("Even number");
			}
}
}
