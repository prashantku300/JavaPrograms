package JavaPrograms;

public class PalindromNumber {
	
	public static void ispalindromenumber(int num) {
		
		System.out.println("Your number is :::"+num);
		
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if 
			(sum==t) {
			System.out.println("Number is Palindrome");
		}
			else {
				System.out.println("Number is not palindrome");
			}
		}
		
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ispalindromenumber(123454321);
		ispalindromenumber(524646);
	}

}
