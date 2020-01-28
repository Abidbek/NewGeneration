package sprint7;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your number: ");
            int input = sc.nextInt();
            if (input>=1){
                if (isPrime(input)){
                    System.out.println(input+" is Prime number");
                }else {
                    System.out.println(input + " is not a Prime number");
                }
            }else {
                System.out.println("Please enter positive numbers only!!!");
            }
        } catch (Exception e) {
            System.out.println("You can try");
        }
    }
    public static boolean isPrime(int n) {
        for (int i =2;i< n;i++){
            if (n%i==0){
                //if n divisible by i, then n is not Prime.
                return false;
            }
        }

        return true;
    }
}
