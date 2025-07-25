package Learning;
import java.util.ArrayList;
import java.util.HashSet;

public class Hashsetexample {

	public static void main(String[] args) {
		HashSet<Object> mySet = new HashSet<>();

        // Add elements
        mySet.add(101);
        mySet.add("Testing");
        mySet.add('B');
        mySet.add(99.99);
        mySet.add(101);
        mySet.add(null);

        System.out.println("HashSet: " + mySet);

        System.out.println("Size of HashSet = " + mySet.size());

        mySet.remove("Testing");
        System.out.println("After Removing 'Testing': " + mySet);

        ArrayList<Object> list = new ArrayList<>(mySet);
        System.out.println("Converted to ArrayList: " + list);
    }
}




