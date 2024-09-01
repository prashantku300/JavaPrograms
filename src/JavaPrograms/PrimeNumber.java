package JavaPrograms;


// final, finally, finalized 
//final: is used to if we define a variable with final keyword than we can not change value of that variable
// finally: is used to with try catch if any condition block is executed is any condition
// finalized: is used to garbage collection for cleanup memory on run time
public class PrimeNumber {
	
	public  static boolean newnumber(int num) {
		
		if (num<=1) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			
			if(num%i==0) {
				return false;
			}}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(newnumber(13));
		
	}
}
// Difference between List and Set