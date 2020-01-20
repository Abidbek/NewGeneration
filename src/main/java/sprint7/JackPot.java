package sprint7;

import java.util.ArrayList;
import java.util.List;

public class JackPot {
    public static void main(String[] args) {
        slotMachine();
    }
    public static void slotMachine(){
        List<String> listOFEl= new ArrayList<>();
        listOFEl.add("@");
        listOFEl.add("abc");
        listOFEl.add("S");
        listOFEl.add("&");
        listOFEl.add("*");
        List<String> ElColl= new ArrayList<>();
        for (int a = 0;a<3;a++)
        {
            int index = (int)(Math.random()*5);
            ElColl.add(listOFEl.get(index));
        }
        for (String a:ElColl) {
            System.out.print(a+" | ");
        }
        if(ElColl.get(0).equals(ElColl.get(1))&&ElColl.get(0).equals(ElColl.get(2))){
            System.out.print("True");
        }
        else System.out.print("False");


    }
}
