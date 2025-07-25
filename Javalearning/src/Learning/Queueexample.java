package Learning;

import java.util.LinkedList;

public class Queueexample {

	public static void main(String[] args) {

		LinkedList<String> Empname=new LinkedList<>();
		Empname.add("Deva");
		Empname.add("Sathya");
		Empname.add("Ram");

		System.out.println(Empname);
		Empname.removeLast();
		Empname.addLast("Lalith");
		System.out.println(Empname);


	}

}
