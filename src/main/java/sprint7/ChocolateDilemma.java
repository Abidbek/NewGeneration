package sprint7;

import java.util.Scanner;

public class ChocolateDilemma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Agatha's pieces");
        int agathaPieces = sc.nextInt();
        int sumForAgatha = 0;
        for (int i = 0; i < agathaPieces; i++) {
            int[] agathaPieceArray = new int[2];
            System.out.println("Give the parameters for " + (i + 1) + " piece");
            agathaPieceArray[0] = sc.nextInt();
            agathaPieceArray[1] = sc.nextInt();
            int length = agathaPieceArray[0];
            int width = agathaPieceArray[1];
            sumForAgatha += (length * width);
        }

        System.out.println("Agatha eat: " + sumForAgatha);

        System.out.println("Enter Bertha's pieces");
        int berthaPieces = sc.nextInt();
        int sumForBertha = 0;
        for (int i = 0; i < berthaPieces; i++) {
            int[] berthaPieceArray = new int[2];
            System.out.println("Give the parameters for " + (i + 1) + " piece");
            berthaPieceArray[0] = sc.nextInt();
            berthaPieceArray[1] = sc.nextInt();
            int length = berthaPieceArray[0];
            int width = berthaPieceArray[1];
            sumForBertha += (length * width);
        }

        System.out.println("Bertha eat: " + sumForAgatha);

        boolean eatSame = isEqual(sumForAgatha,sumForBertha);

        System.out.println("Does they eat same piece amount of chocolate " + eatSame);
    }

    public static boolean isEqual(int a, int b){

        if(a==b){
           return true;
        }else {
            return false;
        }
    }
}
