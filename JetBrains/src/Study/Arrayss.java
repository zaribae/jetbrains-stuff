package Study;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayss {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int min = numbers[0];
        for(int j = 0; j < numbers.length; j++) {
        	if(min > numbers[j]) {
        		min = numbers[j];
        	}
        }
        System.out.println(min);
		
//        int[] arr = new int[len];
//        int sum = 0;
//        
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        int n = in.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//        	if (arr[i] > n) {
//        		sum+=arr[i];
//        	}
//        }
//        System.out.println(sum);
//		int len = scanner.nextInt(); // reading a length
//		int[] array = new int[len];  // creating an array with the specified length
//		        
//		for (int i = 0; i < len; i++) {
//		    array[i] = scanner.nextInt(); // read the next number of the array
//		}
//
//		System.out.println(Arrays.toString(array)); // output the array
	}

	

}
