package input_form;

/**
 * @author Artem Stukalenko
 * stukalenko.artem@gmail.com
 * @since 04.07.2021
 */

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);

        controller.processUser();
    }
}
