package sprint7;

import java.util.Arrays;
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
        int arrayLength = scanner.nextInt();
        strings = new String[arrayLength];
        int counter = 0;
        while(counter<strings.length){
            System.out.println("Please enter your element:");
            strings[counter] = scanner.next();
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
                }
            }
        }
        return isPresent;
    }
}
