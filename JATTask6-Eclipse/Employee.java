package JATTask6;

public class Employee {
	
	private int ID;
	private String FirstName;
	private String LastName;
	private int Salary;
	
	public Employee(int ID, String FirstName, String LastName, int Salary ) {
		this.ID=ID;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Salary=Salary;
	}	
	public int getID() {
		return ID;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public int getSalary() {
		return Salary;
	}
	
	public String getName() {
		return FirstName +" "+ LastName;
	}
	
	public void setSalary(int Salary) {
		if(Salary>0) {
			this.Salary=Salary;
		}
	}
	
	public int getAnnualSalary() {
		return Salary *12;		
		 
	}
	public int raiseSalary(int percent) {
		if(percent<=0) {
			return Salary;
		}
		int increased= Salary+(Salary*percent/100);
		setSalary(increased);
		return Salary;
		}
		
     public String toString() {
		return "Employee[ID =" + ID + ", name= "+  getName()  + ", Salary = " + Salary + "]";
    	 
     }
	public static void main(String[] args) {
		Employee obj = new Employee(101, "Ragu", "Ram", 50000);
		System.out.println("Salary Before raise :: " + obj);
		int updatedsalary= obj.raiseSalary(50);
		System.out.println("Salary After raise :: " + updatedsalary);
		System.out.println("Annual Salary " + obj.getAnnualSalary());
	
	
	}
	

}
