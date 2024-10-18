package PracticePrograms;

public class ReverseInteger {

	public static void main(String[] args) {

		long num=244245846;
		
		long rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num= num/10;
		}
		System.out.println("Reverse using Algo::"+rev);
		
		
		
		long l=252546;
		
		System.out.println("Reverse using String buffer:::" +new StringBuffer(String.valueOf(l)).reverse());
		
	}

}
