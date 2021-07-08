package input_form.controller;

import input_form.model.entity.DBNoteBook;
import input_form.model.entity.NotUniqueLoginException;
import input_form.view.TextConstants;
import input_form.view.View;

public interface InputValidator {

    View view = new View();

    static boolean inputIsValid(String input, String regex) {
        if (input.matches(regex)) {
            return true;
        } else {
            view.printMessage(TextConstants.WRONG_INPUT);
            return false;
        }
    }

    static boolean inputIsValidAndUnique(String input, String regex) {
        if (inputIsValid(input, regex)) {
            try {
                DBNoteBook.loginIsUnique(input);
                return true;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                view.printMessage(e.getMessage());
                return false;
            }
        } else {
            return false;
        }
    }
}
