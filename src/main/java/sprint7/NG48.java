package sprint7;

import java.util.*;

public class NG48 {
    static Scanner scanner = new Scanner(System.in);
    static String[] strings = null;

    public static void main(String[] args) {
        getInput();
        getStringsWithNumbers(strings);
    }

    public static String[] getStringsWithNumbers(String[] strings) {
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayList<String> containingNumber = new ArrayList<String>();
        for (String string : strings) {
            for (String number : numbers) {
                if (string.contains(number)) {
                    containingNumber.add(string);
                    break;
                }
            }
        }
        String[] resultingArray = containingNumber.toArray(new String[0]);
        System.out.println(Arrays.toString(strings) + " ---> " + Arrays.toString(resultingArray));
        return resultingArray;
    }

    public static void getInput() {
        int arrayLength = 0;
        System.out.println("Please enter desired length of the array:");
        try {
            arrayLength = scanner.nextInt();
            if (arrayLength < 1) {
                System.out.println("Length of the array cannot be less than 1!");
                getInput();
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a whole number greater than 0:");
            //next(); - lets scanner skip to the next token
            scanner.next();
            getInput();
        }

        strings = new String[arrayLength];
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Please enter your element:");
            strings[i] = scanner.next();
        }
    }
}

// ANOTHER WAY TO HANDLE WRONG INPUT FROM THE USER, NOT USING TRY CATCH BLOCKS.

    /*public static void getInput1(){
        int arrayLength = 0;
        System.out.println("Please enter desired length of the array:");
        if(scanner.hasNextInt()) {
            arrayLength = scanner.nextInt();
            if (arrayLength < 1) {
                System.out.println("Length of the array cannot be less than 1!");
                getInput1();
            }
        }
        else{
            System.out.println("Please enter a whole number greater than 0:");
            //next(); - lets scanner skip to the next token
            scanner.next();
            getInput1();
        }

        strings = new String[arrayLength];
        for(int i = 0; i<strings.length; i++){
            System.out.println("Please enter your element:");
            strings[i] = scanner.next();
        }
    }
*/
