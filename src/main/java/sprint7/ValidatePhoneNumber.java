package sprint7;

import java.util.Scanner;

public class ValidatePhoneNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


            System.out.println("Please enter your phone number for validation: ");
            String phoneNumber = sc.nextLine();

            boolean isValid = isVerify(phoneNumber);

            if (isValid){
                System.out.println("You phone validation is successful passed");
            }else{
                System.out.println("You enter invalid phone number");
            }



    }

    public static boolean isVerify(String str){

        String number = str.replaceAll("[^0-9]", "");
        if(number.length()<10 || number.length()>11){
            return false;
        }else if (number.length()==11 && number.charAt(0) != '1'){
            return false;
        }

        if(str.matches("[+]\\d[-]\\d{3}[-]\\d{3}[-]\\d{4}")){
            return true;
        }else if(str.matches("\\d[-]\\d{3}[-]\\d{3}[-]\\d{4}")){
            return true;
        }else if(str.matches("\\d[.]\\d{3}[.]\\d{3}[.]\\d{4}")){
            return true;
        }else if(str.matches("\\d{11}")) {
            return true;
        }else if(str.matches("\\d[/]\\d{3}[/]\\d{3}[/]\\d{4}")){
            return true;
        }else if(str.matches("\\d{3}[/]\\d{3}[/]\\d{4}")){
            return true;
        }else if(str.matches("\\d{3}[-]\\d{3}[-]\\d{4}")){
            return true;
        }else if(str.matches("\\d{3}[.]\\d{3}[.]\\d{4}")){
            return true;
        }else if(str.matches("\\d{3}\\s\\d{3}\\s\\d{4}")){
            return true;
        }else if(str.matches("\\d\\s\\d{3}\\s\\d{3}\\s\\d{4}")){
            return true;
        }else if(str.matches("\\d\\s[(]\\d{3}[)]\\s\\d{3}[-]\\d{4}")){
            return true;
        }else if(str.matches("[(]\\d{3}[)]\\s\\d{3}[-]\\d{4}")){
            return true;
        }else {
            return false;
        }
    }
}
