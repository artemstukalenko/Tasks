package input_form.controller;

import input_form.model.Model;
import input_form.view.View;
import java.util.Scanner;
import static input_form.controller.InputValidator.inputValid;
import static input_form.controller.RegexContainer.*;
import static input_form.view.TextConstants.*;

public class Controller {
    private View view;
    private Model model;
    private InputNoteNoteBook book;

    {
        book = new InputNoteNoteBook();
    }

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    private String setInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private void setLanguage() {
        String languageChanger = setInput();
        switch (languageChanger.toUpperCase()) {
            case "UA":
                view.changeLanguage();
                break;
            case "EN":
                break;
        }
    }

    public void processUser() {
        view.printMessage(CHANGE_LANGUAGE);
        setLanguage();

        processSurname();

        processLogin();

        view.printInfo(book);
    }

    private void processSurname() {
        String potentialSurname;
        String regex;
        do {
            view.printMessage(MAY_CONTAIN_SURNAME);
            view.printMessage(INSERT_SURNAME);
            potentialSurname = InitCapitalLetter.initCapital(setInput());
            regex = String.valueOf(View.bundle.getLocale()).equals("ua")
                    ? VALID_SURNAME_UA : VALID_SURNAME;
        } while (!inputValid(potentialSurname, regex));

        book.setSurname(potentialSurname);
    }

    private void processLogin() {
        String potentialNickname;

        do {
            view.printMessage(MAY_CONTAIN_LOGIN);
            view.printMessage(INSERT_LOGIN);
            potentialNickname = setInput();
        } while (!inputValid(potentialNickname, VALID_NICKNAME));

        book.setLogin(potentialNickname);
    }
}
