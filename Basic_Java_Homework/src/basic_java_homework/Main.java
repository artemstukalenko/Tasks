package basic_java_homework;

/**
 * @author Artem Stukalenko
 * stukalenko.artem@gmail.com
 * @since 24.06.2021
 */

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUser();
    }
}
