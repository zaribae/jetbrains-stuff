package Study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FileReaders {

	public static void main(String[] args) throws Exception{
		//If you need to read a text, use character input streams. 
		//Otherwise, for example, while reading audio, video, zip, etc., use byte input streams.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String in = reader.readLine();
        String res = in.trim();
        reader.close();
        
        if (in.isEmpty()){
        	System.out.println(0);
        } else {
        	String[] arr = res.split("\\s+");
        	System.out.println(arr.length);
        	
        }
        
	}

}
