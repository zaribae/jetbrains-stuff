package Study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Test Drop\\test.txt");
//		FileInputStream inputStream = new FileInputStream("D:\\Test Drop\\test.txt");
		FileWriter writer = new FileWriter(file, true); //tambahan true untuk append. false untuk rewrite
		
//		System.out.println("File name: " + file.getName());
//		System.out.println("File path: " + file.getPath());
//		System.out.println("Is file: " + file.isFile());
//		System.out.println("Is directory: " + file.isDirectory());
//		System.out.println("Exists: " + file.exists());
//		System.out.println("Parent path: " + file.getParent());
		
		
		writer.write("Lorem ipsum");
		writer.close();
//		byte[] bytes = new byte[5];
//		int numberOfBytes = inputStream.read(bytes);
//		System.out.println(numberOfBytes); // 5
//		inputStream.close();
	}
	
	public static void printRangeToFile(String file, boolean append, int fromIncl, int toExcl) {
	    try (FileWriter writer = new FileWriter(file, append)) {
	        for (int i = fromIncl; i < toExcl; i++) {
	            writer.write(i + " ");
	        }
	    } catch (IOException e) {
	        System.out.printf("An exception occurred %s", e.getMessage());
	    }
	}

}
