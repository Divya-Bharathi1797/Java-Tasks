package Learning;

import java.util.Stack;

public class Stackexample {

	public static void main(String[] args) {

		Stack<String> name=new Stack<>();
		name.push("India");
		name.push("Australia");
		name.push("China");

		System.out.println(name);
		name.pop();
		System.out.println(name);

	}

}
