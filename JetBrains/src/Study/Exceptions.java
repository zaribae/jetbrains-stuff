package Study;

public class Exceptions {
	
	public static void main(String[] args) {
		try {
		    int a = 1, b = 0;
		    int c = 5 / b;
		    System.out.print("A");
		}
		catch (ArithmeticException e) {
		    System.out.print("B");          
		}
		finally {
		    System.out.print("C");
		}
		
	}
	
	public static double convertStringToDouble(String input) {
        try {
        	return Double.parseDouble(input);
        } catch(Exception e) {
        	return 0;
        }
    }
}
