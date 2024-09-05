package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicateeleinarray {

	public static void main(String[] args) {
		
		String name[]= {"java","ruby","python","java","ruby","sql","mysql"};
		
		//This problum is solved by simple for loop ::Time Complicity of this solution is o(nXn)
		for(int i=0; i<name.length; i++)
		{
			for(int j=i+1; j<name.length; j++) {
				
				if(name[i].equals(name[j])) {
					System.out.println("Name of duplicate String is :::"+name[i]);
				}
				
			}
	}

		System.out.println("*************");
		//This problem is solved by HashSet ::Time Complicity of this solution is o(n)
		
		Set<String> store=new HashSet<String>();
		for(String names:name) {
			if(store.add(names)==false) {
				System.out.println("Duplicate String is :::"+names);
				
			}
		}
		
		System.out.println("*************");
		//This problem is solved by HashMap ::Time Complicity of this solution is o(n)
		
		   Map<String, Integer> storemap=new HashMap<String, Integer>();
		   for(String name1:name) {
			   Integer count= storemap.get(name1);
			   if(count==null) {
				   storemap.put(name1, 1);}
			   else 
				   storemap.put(name1, ++count);
				   }
	
			   
		   //Get Values from HashMap
		Set<Entry<String, Integer>>    entrySet=storemap.entrySet();
	      for(Entry<String, Integer> entry:entrySet) {
	    	  
	    	  if(entry.getValue()>1) {
	    		  System.out.println("Duplicate Element is:::::::" +entry.getKey());
	    	  }
	    	  
	      } 
	}	   
}
		
		

