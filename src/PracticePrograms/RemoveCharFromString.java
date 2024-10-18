package PracticePrograms;

public class RemoveCharFromString {

	public static void main(String[] args) {

		String s="Shitan &%^%$ shu ^%$&^$*&";
		String s1=s.replaceAll("[^A-Za-z0-1]", "");
		System.out.println(s.replaceAll("[^A-Za-z0-1]", ""));
		
	}

}
