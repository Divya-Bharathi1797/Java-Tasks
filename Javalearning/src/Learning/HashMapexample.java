package Learning;
import java.util.HashMap;

public class HashMapexample {

	public static void main(String[] args) {
		HashMap<String, Integer> emp = new HashMap();
		emp.put("Aishu", 100);
		emp.put("Divi", 200);
		emp.put("Suba", 80);

		System.out.println(emp);

		if(emp.containsKey("Suba")) {
			System.out.println("Key is available");
		}
		else {
			System.out.println("key is not available in employee name");
		}


	}

}
