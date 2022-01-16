package Study;

public class Main
{
    public static void main(String[] args) {
        double number = 1357.05;
        double number_log = Math.log10(number);
        double number_round =  Math.round(number_log);
        System.out.println(number_round);
        
        int[] arr = {1,2,3,4};
        System.out.println(arr.length);
    }
    
    public static void printNumberOfArguments(int... numbers) {
        System.out.println(numbers.length);
    }
}
