package faq100a;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatesInArrayVIIQ5 {
     //How to find duplicate elements from specific type of Array-String type, or int type??
	public static void main(String[] args) {
		
		String names[]= {"java", "javaScript", "Ruby", "C", "java", "python"};
		
		//1.compare each element---worst approach:timecomplexity is o(nxn)
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("duplicate element is::"+names[i]);
				}
				//System.out.println();
			}
		}
		
		//2.time complexity o(n) solution: using HashSet:javacollection-it stores unique values
		Set<String> store = new HashSet<String>();
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println("duplicate element is(using HashSet,o(n))::"+name);
			}
		}
		
      //3.using HashMap-timecomplexity(o(2n))BEST:stores in k,v format BUT allows duplicates as well
		Map<String, Integer> hmStoreMap = new HashMap<String,Integer>();
		
		for(String name:names) {
			Integer count = hmStoreMap.get(name);
			if(count==null) {
				hmStoreMap.put(name, 1);
			}else {
			    hmStoreMap.put(name, ++count);
			}
		}
		//get the values from this hashmap:using entry set--which return set of entry
		
		Set<Entry<String, Integer>> es = hmStoreMap.entrySet();
		
		for(Entry<String, Integer>entry:es) {
			if(entry.getValue()>1) {
				System.out.println("duplicate element is::"+entry.getKey());
			}
		}
	}

}
