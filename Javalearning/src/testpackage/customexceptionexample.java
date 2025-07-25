package testpackage;

class oddnumberexceptions extends Exception{
	oddnumberexceptions(String msg){
		System.out.println(msg);
}

public class customexceptionexample {

	public static void main(String[] args) {
		try {
			number(11);
		}
	catch(oddnumberexceptions oe) {
		System.out.println(oe);
	}
	}
}

public static void number(int num) throws oddnumberexceptions {
	if (num%2 !=0) {
		throw new oddnumberexceptions ("odd number");
			}
	else {
		System.out.println("Even number");
			}
}
}

