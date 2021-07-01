package basic_java_homework;

public class View {
    public static final String INPUT_FIELD_HELLO = "Say «Hello»: ";
    public static final String INPUT_FIELD_WORLD = "Say «world!»: ";
    public static final String WRONG_INPUT = "Wrong input! Try again!";
    public static final String YOUR_GREETING = "Your greeting: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndGreeting(String message, String greeting) {
        System.out.println(message + greeting);
    }
}
