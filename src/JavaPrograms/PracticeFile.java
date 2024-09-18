package JavaPrograms;

public class PracticeFile {

	public static void main(String[] args) {

	String test1="PrashantKumar";
	
	int Length=test1.length();
	
	 char[] test3=test1.toCharArray();
	
	for(int i=0; i<Length; i++) {
		
		for(int j=i+1; j<Length; j++)
		{
			if(test3[i]==test3[j]) {
		
		System.out.println("Duplicate char in string is ::"+ test3[i]);
		break;
			}
		}
	}
	}}

