package input_form.model.entity;

import static input_form.view.TextConstants.NOT_UNIQUE_LOGIN;

public enum DBNoteBook {
    NOTE_ONE("Limonova", "o_limonova12"),
    NOTE_TWO("Kovrizhenko", "kv4rzh"),
    NOTE_THREE("Petrov", "p3tr0v");

    private String surname;
    private String login;

    DBNoteBook(String surname, String login) {
        this.surname = surname;
        this.login = login;
    }

    public String getFirstName() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public static boolean loginIsUnique(String loginToCheck) throws NotUniqueLoginException {
        for (DBNoteBook note : DBNoteBook.values()) {
            if (note.getLogin().equals(loginToCheck)) {
                throw new NotUniqueLoginException(NOT_UNIQUE_LOGIN, loginToCheck);
            }
        }
        return true;
    }
}
