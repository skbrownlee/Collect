import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		System.out.println(list.indexOf("particular string"));
		
		HashMap<String, Integer> hasher = new HashMap<String, Integer>();
		hasher.put("Hey", 1);
		hasher.put("Hoy", 2);
		System.out.println(hasher.toString());
		
		
		TreeMap<Thingy, Integer> tree = new TreeMap<Thingy, Integer>();
		tree.put(new Thingy("Bill"), 1);
		tree.put(new Thingy("Alex"), 2);
		System.out.println(tree.toString());
		
		// Tree map autoSorts the entries and HashMap accesses them randomly
		
		// You should use a treemap to guarantee the order of keys.
		
	}

}
