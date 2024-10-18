package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {

		String s="RamRamJi";
		
		//Using string buffer String buffer is a mutable object 

			StringBuffer sf=new StringBuffer(s);
			
			System.out.println(sf.reverse());
		
		int l=s.length();
		
        String rev="";
        
        for(int i=l-1;i>=0; i--) {
        	
        	rev=rev+s.charAt(i);
        	
        }
        System.out.println(rev);
	}
	

}
