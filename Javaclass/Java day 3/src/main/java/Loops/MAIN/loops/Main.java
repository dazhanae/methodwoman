package Loops.MAIN.loops;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static String oneToTen(){
        String response = "*** Output ***";
        for( int x = 1; x < 11; x++)
            response = response += "\n + X";
        return response;
    }

    public static void main(String[] args) {
        System.out.println(oneToTen());
        int intNumber = 23;
        long longNumber = intNumber;

        double x = 13.897;
        int y = x;
        int y = (int) x;
        System.out.println(y);

    }
