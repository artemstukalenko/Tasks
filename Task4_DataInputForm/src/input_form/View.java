package input_form;

public class View {
    public static final String INSERT_SURNAME = "Insert surname: ";
    public static final String INSERT_NICKNAME = "Insert nickname: ";
    public static final String MAY_CONTAIN_SURNAME = "Surname may contain one word or two words, " +
            "separated by whitespace or hyphen.";
    public static final String MAY_CONTAIN_NICKNAME = "Nickname may contain only lowercase english letters, " +
            "underscores and digits from 4 to 15 characters.\nIt has to start with at least one letter.";
    public static final String PRINT_SURNAME = "Surname: ";
    public static final String PRINT_NICKNAME = "Nickname: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printModelInfo(Model model) {
        System.out.println(PRINT_SURNAME + model.getSurname());
        System.out.println(PRINT_NICKNAME + model.getNickname());
    }
}
