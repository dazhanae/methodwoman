package Passwords;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int D = 0;
        boolean checker = true;
        while (checker) {

            System.out.println("What is your password?");
            String pass = input.nextLine();

            if (pass.equals("JavaMoney")) {

                System.out.println("You are logged in!");
                checker = false;
            } else {
                D++;
                System.out.println(" Your entry is incorrect " + D + " times ");
            } if (D > 2){
                System.out.println("Your account is now locked! ");
                checker = false;
            }


        }


    }
    }