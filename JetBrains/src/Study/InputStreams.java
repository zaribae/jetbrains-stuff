package Study;

import java.io.IOException;
import java.io.InputStream;

public class InputStreams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 try {
	            InputStream inputStream = System.in;
	            int i = inputStream.read();
	            while (i != -1) {
	                System.out.print(i);
	                i = inputStream.read();
	            }
	        } catch (IOException ex) {
	            System.out.println(ex.getMessage());
	        }
	}

}
