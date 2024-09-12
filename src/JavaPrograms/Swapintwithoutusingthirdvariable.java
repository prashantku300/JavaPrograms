package JavaPrograms;

public class Swapintwithoutusingthirdvariable {

	public static void main(String[] args) {
		int a=59;
		int b=99;
		
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("Value of a is::"+a);
       System.out.println("Value of b is::"+b);

	}

}
