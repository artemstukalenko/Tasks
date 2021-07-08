package input_form.view;

import input_form.model.entity.NoteBook;
import java.util.Locale;
import java.util.ResourceBundle;
import static input_form.view.TextConstants.*;

public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en"));

    public void printMessage(String message) {
        System.out.println(bundle.getString(message));
    }

    public void printInfo(NoteBook book) {
        System.out.println(bundle.getString(PRINT_SURNAME) + book.getSurname());
        System.out.println(bundle.getString(PRINT_LOGIN) + book.getLogin());
    }

    public void changeLanguage() {
        bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("ua"));
    }
}
