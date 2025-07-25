package Learning;

public class Copycons {

	int age;
	String name;

	public Copycons(int a, String b) {
		age=a;
		name=b;
		System.out.println(age+ " " + name);
	}
	public Copycons(Copycons demo) {
		age=demo.age;
		name=demo.name;


	}


	public static void main(String[] args) {
		Copycons obj =new Copycons(20, "Hari");


	}

}
