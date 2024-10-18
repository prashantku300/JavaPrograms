package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordInGivenSentense {

	public static void main(String[] args) {
		
		String s="This is my alka jaan and alka is my jaan jaan jaan ashu";
		String[] s1=s.split("\\s+");
		
		     Map<String, Integer>  NewString= new HashMap<>();
		for(int i=0; i<s1.length; i++) {
			
		 String s2=s1[i].toLowerCase();
		 
				if(NewString.containsKey(s2)) {
					NewString.put(s2, NewString.get(s2) +1);
				}
					else {
						NewString.put(s2, 1);
				}
			}
		     System.out.println("Duplicate words");
		     for(Map.Entry<String, Integer> entry : NewString.entrySet()) {
		    	 if(entry.getValue()>1) {
		    		 System.out.println(entry.getKey() + "::"+ entry.getValue() + "Times");
		    	 }
		}
         	}
	}


