package PracticePrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Chutiya Bhim";
		int l=s.length();
		String Rev="";

		for(int i=l-1; i>=0; i--) {
			
			Rev= Rev + s.charAt(i);
		}
		System.out.println(Rev);
			
		

	StringBuffer sf= new StringBuffer(s);
	System.out.println(sf.reverse());
	
	}
}
