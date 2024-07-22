package javacollections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashM {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Bindu");
		hm.put(2, "Sindu");
		hm.put(3, "Chandu");
		hm.put(4, "Nandu");
		

    for(Entry e:hm.entrySet()) {
    	System.out.println(e.getKey()+" "+e.getValue());
    }

	}

}
