package JATTask6;

public class Person {
	
	String name;
	int age;
	
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	} 

	public static void main(String[] args) {
		Person obj=new Person("Ragu" , 28);
		System.out.println("The name of person is " + obj.getName() + " and age is " + obj.getAge() );
		

	}
}
