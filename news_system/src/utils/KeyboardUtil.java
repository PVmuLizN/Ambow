package utils;

import java.util.Scanner;

public class KeyboardUtil {

    // a static scanner object to be shared by all methods
    private static Scanner scanner = new Scanner(System.in);

    // a private constructor to prevent instantiation
    private KeyboardUtil() {
    }

    // a static method to read an integer from the keyboard
    public static int readInt() {
        return scanner.nextInt();
    }

    // a static method to read a string from the keyboard
    public static String readString() {
        return scanner.nextLine();
    }

    // a static method to close the scanner
    public static void close() {
        scanner.close();
    }
}
