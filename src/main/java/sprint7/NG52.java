package sprint7;

import java.util.Arrays;
import java.util.Scanner;


public class NG52 {
    static Scanner scanner = new Scanner(System.in);
    static int[] numbers = null;
    static int arrayLength = 0;
    static int counter;

    public static void main(String[] args) {
        getInput();
        sortPositive(numbers);
    }

    public static void getInput() {
        do {
            System.out.println("Please enter desired length of the array:");
            if (scanner.hasNextInt()) {
                arrayLength = scanner.nextInt();
            } else {
                System.out.println("The length must be a whole number greater than 0!");
                scanner.next();
            }
        } while (arrayLength <= 0);

        numbers = new int[arrayLength];
        counter = 0;
        while(counter<numbers.length){
            System.out.println("Please enter your element:");
            if(scanner.hasNextInt()){
                numbers[counter] = scanner.nextInt();
                counter++;
            }
            else{
                System.out.println("Please enter only whole numbers!");
                scanner.next();
            }
        }
    }

    public static int[] sortPositive(int[] numbers){
        int[] positiveNumbers = new int[numbers.length];
        counter = 0;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]>=0){
                positiveNumbers[counter] = numbers[i];
                counter++;
            }
        }
        boolean isSwapped = true;
        int temp;
        while(isSwapped){
            isSwapped = false;
            for(int i = 0; i<positiveNumbers.length-1; i++){
                if(positiveNumbers[i]>positiveNumbers[i+1] && positiveNumbers[i+1]!=0){
                    temp = positiveNumbers[i];
                    positiveNumbers[i] = positiveNumbers[i+1];
                    positiveNumbers[i+1] = temp;
                    isSwapped = true;
                }
            }
        }
        counter = 0;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]>=0){
                numbers[i] = positiveNumbers[counter];
                counter++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }
}
