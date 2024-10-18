package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class TodaysPractice {

	public static void main(String[] args) {

		String s= "This is  my test automation and automation is the key of success this this this thsi this ";
		
	String s1[] =s.split("\\s+");
	
	 Map<String, Integer> NewValue= new   HashMap<>();
	 for(int i=0; i<s1.length; i++) {
		  String s2=s1[i].toLowerCase();
		  if(NewValue.containsKey(s2)) {
			  NewValue.put(s2, NewValue.get(s2) +1);
		  }
			  else {
				  NewValue.put(s2, 1);
			  }
		  }
	 System.out.println("Duplicate words::");
	 
	 for(Map.Entry<String, Integer> entry: NewValue.entrySet()) {
		 if(entry.getValue()>1) {
			 System.out.println(entry.getKey() + "::" + entry.getValue());
		 }
	 
	 }

			}

	
		
	
}
