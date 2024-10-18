package PracticePrograms;

public class MissingNumArrey {

	public static void main(String[] args) {

		int num[]= {1,2,3,4,5,6};
		int num1=num.length;
	    int	sum=0;
	    for(int i=0;i<num1; i++) {
	    	sum=sum+num[i];
	    }
		System.out.println("Sum of number is ::"+sum);
		
		int add=0;
		for(int j=1; j<=7; j++) {
			
			add=add+j;
			
		}
		System.out.println("Missing number is ::"+(add-sum));
	}
}
