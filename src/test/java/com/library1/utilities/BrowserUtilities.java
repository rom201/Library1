package com.library1.utilities;

public class BrowserUtilities {

    public static void wait(int sec) {

        try {
            Thread.sleep(1000 * sec);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception here");
            ;
        }
    }
}