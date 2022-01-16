package Project;

import java.util.Scanner;

public class SimpleSE {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int index = 0;
        String ket = "";

        String input = in.nextLine();
        String[] arr = input.split(" ");

        String input2 = in.nextLine();
        in.close();
        
        for(int i = 0; i < arr.length; i++) {
        	if (arr[i].contains(input2)) {
        		index = i + 1;
        		System.out.println(index);
        	}
        	if (!arr[i].contains(input2)) {
        		System.out.println("Not found");
        	}
        }
	}

}
