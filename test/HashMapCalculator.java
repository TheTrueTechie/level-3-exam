import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public static void main(String[] args) {
		
	}

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int i = 0;
		
		for (String key : hashmap1.keySet()) {
			String value1 = hashmap1.get(key);
			if (value1.equals(hashmap2.get(key))) {
				i++; 
			
				
			}
		}
		return i;
	}

}
