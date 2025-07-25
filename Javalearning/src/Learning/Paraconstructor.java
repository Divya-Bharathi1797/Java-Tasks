package Learning;

public class Paraconstructor {

	int EmpID;
	String Name;
	char grade;

	Paraconstructor(int a, String b, char c){
		EmpID=a;
		Name=b;
		grade=c;
		System.out.println(EmpID +" " + Name+ " " + grade);

	}

	public static void main(String[] args) {
		Paraconstructor object=new Paraconstructor(1, "Varun", 'A');


}

}
