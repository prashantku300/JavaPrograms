package JavaPrograms;

public class manipulationstring {

	public static void main(String[] args) {
		String s= "Test Automation By Prashant Kumar By Selenium";
		String s1= "Test automation By Prashant Kumar By Selenium";
		
		System.out.println(s.length());
		System.out.println(s.charAt(10));
        System.out.println(s.indexOf("t"));
        System.out.println(s.indexOf("t",s.indexOf("t",s.indexOf("t", s.indexOf("t")+1)+1)+1));
        System.out.println(s.indexOf("By"));
        System.out.println(s.indexOf("Testing")); // It will return -1 not getting error
		
        // String comparison 
        
        System.out.println(s.equals(s1));
	    System.out.println(s.equalsIgnoreCase(s1));
	    
	    // Substring
	    System.out.println(s.substring(0, 10));
	    // Trim 
	    String s3= "    Hello Prashant     ";
	    
	    System.out.println(s3.trim());
	    System.out.println(s3.replace(" ", ""));
	    
	    String date="01-01-2024";
	    System.out.println(date.replace("-", "/"));
	    
	    // Split method
	    
	    String test= "Hello_world_we_are_here";
	    String test1[]=test.split("_");
	    for(int i=0;i<test1.length; i++)
	    {
	    System.out.println(test1[i]);
     	}
	     // concat
	    String s4= "Prashan";
	    System.out.println(s4.concat("t"));

}}
