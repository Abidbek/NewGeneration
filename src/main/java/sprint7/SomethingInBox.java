package sprint7;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SomethingInBox {
    static Scanner scanner = new Scanner(System.in);
    static String[] strings = null;
    public static void main(String[] args) {
        getInput();
        System.out.println(Arrays.toString(strings) + "--> " + isSomethingInBox(strings));
    }

    public static void getInput(){
        System.out.println("Please enter the length of your array:");
        int arrayLength = 0;
        try{
            arrayLength = scanner.nextInt();
            if(arrayLength<1){
                System.err.println("The length of the array must be defined with a whole number greater than 1!");
                System.exit(-1);
            }
        }
        catch (InputMismatchException e){
            System.err.println("The length of the array must be defined with a whole number greater than 1!");
            System.exit(-1);
        }
        strings = new String[arrayLength];
        int counter = 0;
        while(counter<strings.length){
            System.out.println("Please enter your element:");
            strings[counter] = scanner.next();
            for(int i = 0; i<strings[counter].length(); i++){
                if(strings[counter].charAt(i)!='#' && strings[counter].charAt(i)!='*'){
                    System.out.println("Please enter a valid string, only # and * allowed!");
                    System.exit(-1);
                }
            }
            counter++;
        }
    }

    public static boolean isSomethingInBox (String[] strings){
        boolean isPresent = false;
        String asterisk = "*";
        for(int i = 0; i<strings.length; i++){
            if(strings[i].contains(asterisk)){
                int indexOfAsterisk = strings[i].indexOf(asterisk);
                for(int j = indexOfAsterisk; j<strings[i].length()-1; j++) {
                    if (strings[i].charAt(0) == '#' && strings[i].charAt(indexOfAsterisk + 1) == '#') {
                        isPresent = true;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return isPresent;
    }
}
