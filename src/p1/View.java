package p1;

import java.util.ArrayList;

public class View {
    public static final String GREETING = "I made a number in range between 0 and 100. Try to guess it!";
    public static final String INPUT_FIELD = "Type in a number between ";
    public static final String AND = " and ";
    public static final String WRONG_INPUT = "Wrong input! Try again!";
    public static final String YOU_WON = "You won! Good job! The sought number is ";
    public static final String ATTEMPT_STATISTICS = "Your attempt statistics: ";
    public static final String TYPE_INTEGER = "Type an integer, please!";
    public static final String ALREADY_INSERTED = "This value has already been inserted!";
    public static final String PREVIOUS_ATTEMPTS = "Your previous attempts: ";
    public static final String FRAME = "**************************************************";
    public static final String USED_ATTEMPTS_FIRST = "You have used ";
    public static final String USED_ATTEMPTS_SECOND = " attempts";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printRangeMessage(String firstMessage, int lowerBound,
                             String secondMessage, int upperBound) {
        System.out.println(firstMessage + lowerBound + secondMessage + upperBound);
    }

    public void printWinMessage(String message, int number) {
        System.out.println(message + number);
    }

    public void printAttempts(ArrayList<Integer> attempts, String message) {
        System.out.println(message + attempts);
    }

    public void printAttemptsCount(String message, int count, String message2) {
        System.out.println(message + count + message2);
    }
}
