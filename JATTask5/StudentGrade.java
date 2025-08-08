package JATTask5;
import java.util.Scanner;
public class StudentGrade {	
	static int mark;

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Student Mark");
		mark=obj.nextInt();
		
		if (mark > 100 || mark < 0) {
			System.out.println("Invalid Input");
			}
		else if ((mark>=90) && (mark<=99)){
			System.out.println("Obtained grade for mark is A");	
			
		}
		else if ((mark>=80) && (mark<=89)){
			System.out.println("Obtained grade for mark is B");	
			
		}
		else if ((mark>=70) && (mark<=79)){
			System.out.println("Obtained grade for mark is C");	
			
		}
		else if ((mark>=60) && (mark<=69)){
			System.out.println("Obtained grade for mark is D");	
			
		}
		else if ((mark>=50) && (mark<=59)){
			System.out.println("Obtained grade for mark is E");	
			
		}
		else {
			System.out.println("Obtained grade for mark is F");	
		}
	}

}
