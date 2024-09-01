package JavaPrograms;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {5,8,6,9,2,37,4,31};
		
		int l=num.length;
		
	//	Arrays.sort(num);
	//	System.out.println(num[l-2]);
		
		 int temp;
		 for(int i=0; i<l; i++) {
			 for(int j=i+1; j<l; j++) {
				 if (num[i]>num[j]) {
			 
			 temp=num[i];
			 num[i]=num[j];
			 num[j]=temp;
				 } 
		 }
		
	}
		 System.out.println(num[l-2]);
}}
