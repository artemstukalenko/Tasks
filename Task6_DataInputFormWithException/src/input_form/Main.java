package input_form;

import input_form.controller.Controller;
import input_form.model.Model;
import input_form.view.View;

/**
 * @author Artem Stukalenko
 * stukalenko.artem@gmail.com
 * built on 06.07.2021
 */

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);

        controller.processUser();
    }
}
