package loanQualifications;

import java.util.Scanner;

public class paycheck {
    public static void main(String[] args) {
        Scanner checks = new Scanner(System.in);
        System.out.println("What is your hourly pay?");

        double hours = checks.nextDouble();
        System.out.println("How many hours have you worked?");

        double hoursCompleted = checks.nextDouble();

        if (hours < 40) {
            System.out.println((hours * 1.5) + hoursCompleted);

        }else if (hours >= 40);
        System.out.println(hoursCompleted * hours);


    }
}
