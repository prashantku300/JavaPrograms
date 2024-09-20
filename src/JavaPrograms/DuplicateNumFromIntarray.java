package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumFromIntarray {

	public static List<Integer> Duplicatenum(int[] num) {
		

			 
			    Arrays.sort(num);
			    List<Integer> list= new ArrayList<>();
			    

			for(int i=0; i<num.length; i++) {
				for(int j=i+1; j<num.length; j++) {
					if(num[i]==num[j] && !list.contains(num[i])) {
						list.add(num[i]);
					}	}  }
			return list;
			}

public static void main(String[] args) {
	
	  int [] num1= {45,55,25,67,89,25,56,55,8,7,8,7};
	  System.out.println(Duplicatenum(num1));
	
}}


