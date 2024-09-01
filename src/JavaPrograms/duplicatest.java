package JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicatest {

	public static void main(String[] args) {
		String s = "Automation testing";
	char[] c = s.toCharArray();
//	int l = c.length;
//	System.out.println(l);
	
	Map<Character,Integer> storemap= new HashMap<Character, Integer>();
	for(Character test:c) {
		if(storemap.containsKey(test)) {
			storemap.put(test, storemap.get(test)+1);
		}
		else {
			storemap.put(test, 1);
		}
			
		}
	
	Set<Entry<Character, Integer>> entry =storemap.entrySet();
	for(Entry<Character, Integer> e:entry)
	{
		System.out.println(e.getKey()+""+e.getValue());
	}
	
	}

}
// this code is commit