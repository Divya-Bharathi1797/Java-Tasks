package Learning;

public class Consoverloading {

	Consoverloading() {
		System.out.println("Default constructor");

	}

Consoverloading(String b) {
		System.out.println("String Arg Constructor");
	}

Consoverloading(char c) {
	System.out.println("Character Arg Constructor");

}

	public static void main(String[] args) {
		Consoverloading obj1=new Consoverloading();
		Consoverloading obj2=new Consoverloading("Divi");
		Consoverloading obj3=new Consoverloading('B');



	}

}
