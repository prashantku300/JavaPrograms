package JavaPrograms;

public class Removespecialchar {

	public static void main(String[] args) {
		String s="shgf%$#^&89237heh26SFRTIJ25562@@!#$@%gbhbd";
		s=s.replaceAll("[^a-zA-Z]", "");
		System.err.println(s);

	}

}
