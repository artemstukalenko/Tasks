package basic_java_homework;

import java.util.Scanner;

public class Controller {
    private final Model MODEL;
    private final View VIEW;

    public Controller(Model model, View view) {
        MODEL = model;
        VIEW = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        VIEW.printMessage(View.INPUT_FIELD_HELLO);
        processFirstInput(sc);

        VIEW.printMessage(View.INPUT_FIELD_WORLD);
        processSecondInput(sc);

        if (MODEL.getUserGreeting().equals("Hello world!")) {
            VIEW.printMessageAndGreeting(View.YOUR_GREETING, MODEL.getUserGreeting());
        }
    }

    public void processFirstInput(Scanner sc) {
        String firstInput;

        do {
            firstInput = sc.nextLine();
            if (firstInput.equals("Hello")) {
                MODEL.setUserGreeting(firstInput);
            } else {
                System.out.println(View.WRONG_INPUT);
                VIEW.printMessage(View.INPUT_FIELD_HELLO);
            }
        } while (!firstInput.equals("Hello"));
    }

    public void processSecondInput(Scanner sc) {
        String secondInput;

        do {
            secondInput = sc.nextLine();
            if (secondInput.equals("world!")) {
                MODEL.setUserGreeting(secondInput);
            } else {
                System.out.println(View.WRONG_INPUT);
                VIEW.printMessage(View.INPUT_FIELD_WORLD);
            }
        } while (!secondInput.equals("world!"));
    }
}
