package Programs;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {

        // 1. Get number of hours worked
        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        // 2. Get the hourly pay rates
        System.out.println("Enter the employees pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();
        // 3. Multiply hours and pay rate
        double grossPay = hours * rate;
        // 4. Display result
        System.out.println(grossPay);
    }
}
