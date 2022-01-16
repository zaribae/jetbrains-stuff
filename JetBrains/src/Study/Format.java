package Study;

public class Format {

	public static void main(String[] args) {
//		System.out.printf("My name is %s i was born in %.3f", "Mike", 19.23);
//		System.out.println();
//		System.out.printf("The sum of %d and %d is %d", 15, 40, 55);
		String str1;
		String str2 = "123";

		if (str2.equals(str1 = "123")) {
		    str2 = null;
		}

		str1 = str2;
		str2 = str1;

		System.out.println(str2);
		
	
	}

}
