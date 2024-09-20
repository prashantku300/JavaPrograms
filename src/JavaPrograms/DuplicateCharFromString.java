package JavaPrograms;

public class DuplicateCharFromString {

	public static void main(String[] args) {

		String s="NeemKaroliwaleBaba";
		
		String s1=s.toLowerCase();
    	int len=s1.length();
    	char[] c= s1.toCharArray();
    	
    	for(int i=0; i<len; i++) {
    		for(int j=i+1; j<len; j++) {
    			if(c[i]==c[j]) {
    				System.out.println("Duplicate char in given string is::" +c[j] );
    				break;
    			}
    			
    		}
    		
    	}
	
		
		
	}
	
}

