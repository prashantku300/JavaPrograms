package JavaPrograms;

public class FactorialNumber {
	
	// without recursive ---Using for loop
	int fact;
	public  static int factorialnumber(int num) {
		if(num==0)
			return 1;
		
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
			
		}
		return fact;
	}
	
// By recursive number factorial of number
	
	public int factorialrec(int num) 
	{
		if (num==0)
			return 1;
		else
			return(num*fact(num-1));
		
		
	}
	

	public static void main(String[] args) {
	System.out.println(factorialnumber(7));

	}

}
