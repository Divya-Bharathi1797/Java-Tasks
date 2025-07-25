package Learning;

import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
				list.add(true);
				list.add("Divi");
				list.add(1000);
				list.add('B');
				System.out.println(list);
				System.out.println("Size of Arraylist" + list.size());
				System.out.println(list.remove(1000));
				//System.out.println("Size of Arraylist" + list.size());
				System.out.println(list);

		

	}

}
