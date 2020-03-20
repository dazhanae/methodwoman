package loanQualifications;

import java.util.Scanner;

public class companyLoans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much is your income");

        int userInput = scanner.nextInt();

        System.out.println("How many years have you been with your company");
        int years = scanner.nextInt();

        if (userInput >= 80000){
        System.out.println("yay, you qualify for a loan");

        } else
            System.out.println("you are short by " + (80000 - userInput));
            }
    }

