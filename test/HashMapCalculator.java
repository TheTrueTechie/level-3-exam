import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		ArrayList<String> key1 = new ArrayList<String>();
		ArrayList<String> key2 = new ArrayList<String>();
		ArrayList<String> value1 = new ArrayList<String>();
		ArrayList<String> value2 = new ArrayList<String>();

		for (int i = 0; i < hashmap1.size(); i++) {
			// System.out.println(hashmap1.keySet());
			// System.out.println(hashmap1.values());

			key1.addAll(hashmap1.keySet());
			
			//System.out.println(key1.get(i));
			
			if (key1.get(i).equals(key2.get(i))) {
				System.out.println(":D");
			}
		}

		for (int i = 0; i < hashmap2.size(); i++) {
			key2.addAll(hashmap2.keySet());
		}

		for (int i = 0; i < hashmap1.size(); i++) {
			value1.addAll(hashmap1.values());
		}
		for (int i = 0; i < hashmap2.size(); i++) {
			value2.addAll(hashmap2.values());
		}

		for (int i = 0; i < key1.size(); i++) {
			System.out.println(key1.get(i));
			System.out.println(key2.get(i));
		}
		
		return null;
	}

}
