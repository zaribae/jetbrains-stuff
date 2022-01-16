package Project;

import java.util.Scanner;
public class BullsAndCow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to Amazing Numbers!\n" +
                "Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter two natural numbers to obtain the properties of the list:\n" +
                "  * the first parameter represents a starting number;\n" +
                "  * the second parameters show how many consecutive numbers are to be processed;\n" +
                "- separate the parameters with one space;\n" +
                "- enter 0 to exit.\n");
        boolean turn = true;
        while (turn) {
            System.out.print("\nEnter a request: ");
            String input = scanner.nextLine();
            String[] inputs = input.split("\\s+");
            if (inputs.length == 1) {
                try {
                    turn = properties(Long.parseLong(inputs[0]));
                } catch (Exception e) {
                    System.out.println("The first parameter should be a natural number or zero");
                }
            } else if (inputs.length == 2) {
                try {
                    long secondPar = Long.parseLong(inputs[1]);
                    if (secondPar > 0) {
                        try {
                            for (int i = 0; i < secondPar; i++) {
                                turn = propertiesWith2Par(Long.parseLong(inputs[0]) + i);
                            }
                        } catch (Exception e) {
                            System.out.println("The second parameter should be a natural number");
                        }
                    } else {
                        System.out.println("The second parameter should be a natural number");
                    }
                } catch (Exception e) {
                    System.out.println("The first parameter should be a natural number or zero");
                }
            }
        }
    }
    public static boolean buzz(long number) {
        String num = String.valueOf(number);
        return num.endsWith("7") || number % 7 == 0;
    }
    public static boolean duck(long number) {
        String num = String.valueOf(number);
        return num.contains("0");
    }
    public static boolean palindromic(long number) {
        boolean checkPalindromic = true;
        String num = String.valueOf(number);
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(num.length() - i - 1)) {
                checkPalindromic = false;
                break;
            }
        }
        return checkPalindromic;
    }

    public static boolean gapful(long number) {
        if (number < 100) {
            return false;
        } else {
            String num = String.valueOf(number);
            String denominator = num.charAt(0) + Character.toString(num.charAt(num.length() - 1));
            long newDenominator = Long.parseLong(denominator);
            return number % newDenominator == 0;
        }
    }

    public static boolean properties(long number) {
        if (number < 0) {
            System.out.print("The first parameter should be a natural number or zero");
            return true;
        } else if (number == 0) {
            System.out.print("Goodbye!");
            return false;
        } else {
            System.out.println("Properties of " + number);
            System.out.print("          even: ");
            System.out.println(number % 2 == 0);
            System.out.print("           odd: ");
            System.out.println(number % 2 == 1);
            System.out.print("          buzz: ");
            System.out.println(buzz(number));
            System.out.print("          duck: ");
            System.out.println(duck(number));
            System.out.print("   palindromic: ");
            System.out.println(palindromic(number));
            System.out.print("        gapful: ");
            System.out.println(gapful(number));
            return true;
        }
    }

    public static boolean propertiesWith2Par(long number) {
        if (number < 0) {
            System.out.print("The first parameter should be a natural number or zero");
            return true;
        } else if (number == 0) {
            System.out.print("Goodbye!");
            return false;
        } else {
            String property = number + " is ";
            if (number % 2 == 0) {
                property = property + " even ";
            } else {
                property = property + " odd ";
            }
            if (buzz(number)) {
                property = property + " ,buzz ";
            }
            if (duck(number)) {
                property = property + " ,duck ";
            }
            if (palindromic(number)) {
                property = property + " ,palindromic ";
            } if (gapful(number)) {
                property = property + " ,gapful ";
            }
            System.out.println(property);
            return true;
        }

    }
}