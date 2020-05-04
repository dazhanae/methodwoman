package Crashcourse;

import Crashcourse.Demo;

public class DemoTester {

    public static void main(String[] args) {

        Demo demo1 = new Demo("Mikey");
        Demo demo2 = new Demo ("chris");
        System.out.println(demo1.welcomeMethod("Micheal "));
    }
}
