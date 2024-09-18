 package JavaPrograms;

public class ArmstrongNumber {
	
	
	
	public static void numberisarmstrong(int num) {

		System.out.println("Given Number is :::::"+num);
		
		int cube=0;
		int r;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if (t==cube) {
			System.out.println("This number is ArmStrog");
		}
		else {
			System.out.println("This number is not ArmStrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		numberisarmstrong(1531);
		numberisarmstrong(371);
	}

}
