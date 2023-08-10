package utils;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class KeyboardUtil {

    // a static scanner object to be shared by all methods
    private static Scanner scanner = new Scanner(System.in);

    // a private constructor to prevent instantiation
    private KeyboardUtil() {
    }

    // a static method to read an integer from the keyboard
    public static int readInt() {
        int value = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        return value;
    }

    // a static method to read a string from the keyboard
    public static String readString() {
        return scanner.nextLine();
    }

    public static Date readDate() {
        String str = scanner.nextLine();
        return DateConvertor.utilToSql(str);

    }

    // a static method to close the scanner
    public static void close() {
        scanner.close();
    }
}
