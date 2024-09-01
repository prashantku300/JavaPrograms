package JavaPrograms;

import java.util.Arrays;

public class SmallestandLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] r= {10,15,25,66,12,10,89,7};
		
		int largest=r[0];
		int smallest=r[0];
		
		for(int i=1; 1<r.length;i++) {
			
			if(r[i]>largest) {
				largest= r[i];
			}
				else if (r[i]<smallest) 
				{
					smallest =r[i];
				}
			
			System.out.println(Arrays.toString(r));

			System.out.println(largest);
			System.out.println(smallest);
				}
		
			}

	}

