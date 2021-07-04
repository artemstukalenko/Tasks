package input_form;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    private String setInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void processUser() {
        processSurname();

        processNickname();

        view.printModelInfo(model);
    }

    private void processSurname() {
        String potentialSurname;

        do {
            view.printMessage(View.INSERT_SURNAME);
            potentialSurname = InitCapitalLetter.initCapital(setInput());
        } while (!surnameIsValid(potentialSurname));

        model.setSurname(potentialSurname);
    }

    public boolean surnameIsValid(String potentialSurname) {
        Pattern surnamePattern = Pattern.compile(ValidInputs.VALID_SURNAME);
        Matcher surnameMatcher = surnamePattern.matcher(potentialSurname);

        if (surnameMatcher.matches()) {
            return true;
        } else {
            view.printMessage(View.MAY_CONTAIN_SURNAME);
            return false;
        }
    }

    private void processNickname() {
        String potentialNickname;

        do {
            view.printMessage(View.INSERT_NICKNAME);
            potentialNickname = setInput();
        } while (!nicknameIsValid(potentialNickname));

        model.setNickname(potentialNickname);
    }

    public boolean nicknameIsValid(String potentialNickname) {
        Pattern nicknamePattern = Pattern.compile(ValidInputs.VALID_NICKNAME);
        Matcher nicknameMatcher = nicknamePattern.matcher(potentialNickname);

        if (nicknameMatcher.matches()) {
            return true;
        } else {
            view.printMessage(View.MAY_CONTAIN_NICKNAME);
            return false;
        }
    }
}
