package input_form.controller;

import input_form.view.TextConstants;
import input_form.view.View;

public interface InputValidator {

    View view = new View();

    static boolean inputValid(String input, String regex) {
        if (input.matches(regex)) {
            return true;
        } else {
            view.printMessage(TextConstants.WRONG_INPUT);
            return false;
        }
    }

}
