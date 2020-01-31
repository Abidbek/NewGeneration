package sprint7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class reverseOddWords {
    public static void main(String[] args) {
        //first split the words in the sentence.
        //create string builder
        //give logic to find odd length to reverse.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input sentence: ");
        String str = sc.nextLine().trim();
        String[] arr = str.split(" ");
        List<String> list = new ArrayList<>();
        for (String a : arr) {
            if (a.length() % 2 == 0) {
                list.add(a);

            } else {

                StringBuilder sb = new StringBuilder(a);
                sb.reverse();
                a = sb.toString();
                list.add(a);

            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}