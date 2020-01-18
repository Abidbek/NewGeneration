package sprint7;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySumTwoLowestNumbers {
    static Scanner scanner = new Scanner(System.in);
    static int [] nums = null;

    public static void main(String[] args) {
        arrayInput();
        getSumTwoSmallestNumbers(nums);
    }

    public static void arrayInput(){
        int arrayLength = 0;
        System.out.println("Please enter the length of your array and press Enter:");
        try{
            arrayLength = scanner.nextInt();
            if(arrayLength>1){
                arrayLength = arrayLength;
            }
            else{
                System.err.println("The length of the array must be defined with a whole number greater than 1!");
                System.exit(-1);
            }
        }
        catch (InputMismatchException e){
            System.err.println("The length of the array must be defined with a whole number greater than 1!");
            System.exit(-1);
        }
        nums = new int[arrayLength];
        int counter = 0;
        while(counter<nums.length){
            System.out.println("Please enter your element:");
            try{
                nums[counter] = scanner.nextInt();
                counter++;
            }
            catch (InputMismatchException e){
                System.err.println("Please enter only whole numbers!");
                scanner.nextLine();
            }
        }
    }

    public static void getSumTwoSmallestNumbers(int[]nums){
        int sum = 0;
        int[]positiveNums = new int[nums.length];
        int counter = 0;
        Arrays.sort(nums);
        for(int j = 0; j<nums.length; j++){
            if(nums[j]>0){
                positiveNums[counter] = nums[j];
                counter++;
            }
        }
        if(positiveNums.length>=2 && positiveNums[1]!=0){
            sum = positiveNums[0] + positiveNums[1];
            System.out.println(sum);
        }
        else{
            System.err.println("There are less than two positive numbers in the array!");
        }
    }
}
