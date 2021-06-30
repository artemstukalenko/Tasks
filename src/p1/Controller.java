package p1;

import java.util.Scanner;

public class Controller {
    private final Model MODEL;
    private final View VIEW;
    private int currentAttempt;

    public Controller(Model model, View view) {
        MODEL = model;
        VIEW = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        MODEL.setPrimaryBounds(GlobalConstants.PRIMARY_LOWER_BOUND,
                                GlobalConstants.PRIMARY_UPPER_BOUND);

        VIEW.printMessage(View.GREETING);

        do {
            processAttempt(sc);
        } while (currentAttempt != MODEL.getSoughtNumber());
    }

    public void processAttempt(Scanner sc) {
        validateAttempt(sc);

        if (currentAttempt < MODEL.getLowerBound()
                || currentAttempt > MODEL.getUpperBound()) {
            VIEW.printMessage(View.WRONG_INPUT);
            VIEW.printRangeMessage(View.INPUT_FIELD, MODEL.getLowerBound(), View.AND, MODEL.getUpperBound());
        } else if (currentAttempt == MODEL.getSoughtNumber()) {
            MODEL.updateAttempts(currentAttempt);
            VIEW.printMessage(View.FRAME);
            VIEW.printWinMessage(View.YOU_WON, MODEL.getSoughtNumber());
            VIEW.printAttemptsCount(View.USED_ATTEMPTS_FIRST, MODEL.getUserAttempts().size(),
                    View.USED_ATTEMPTS_SECOND);
            VIEW.printAttempts(MODEL.getUserAttempts(), View.ATTEMPT_STATISTICS);
            VIEW.printMessage(View.FRAME);
        } else {
            if (!isPrimaryBoundEqual(currentAttempt)) {
                MODEL.updateAttempts(currentAttempt);
                VIEW.printAttempts(MODEL.getUserAttempts(), View.PREVIOUS_ATTEMPTS);
            } else {
                VIEW.printMessage(View.WRONG_INPUT);
            }
            VIEW.printRangeMessage(View.INPUT_FIELD, MODEL.getLowerBound(), View.AND, MODEL.getUpperBound());
        }
    }

    public void validateAttempt(Scanner sc) {
        boolean isInt = false;

        do {

            String validator = sc.next();
            try {
                currentAttempt = Integer.parseInt(validator);
                isInt = true;
            } catch (NumberFormatException e) {
                VIEW.printMessage(View.TYPE_INTEGER);
                VIEW.printRangeMessage(View.INPUT_FIELD, MODEL.getLowerBound(), View.AND, MODEL.getUpperBound());
                continue;
            }

            if ( (!isUnique(currentAttempt)) ) {
                if (currentAttempt < MODEL.getLowerBound()
                        || currentAttempt > MODEL.getUpperBound()) {
                    break;
                }
                VIEW.printMessage(View.ALREADY_INSERTED);
                VIEW.printRangeMessage(View.INPUT_FIELD, MODEL.getLowerBound(), View.AND, MODEL.getUpperBound());
            }

        } while(!isInt || !isUnique(currentAttempt));
    }

    private boolean isUnique(int attempt) {
        return !MODEL.getUserAttempts().contains(attempt);
    }

    private boolean isPrimaryBoundEqual(int currentAttempt) {
        return currentAttempt == GlobalConstants.PRIMARY_UPPER_BOUND
                || currentAttempt == GlobalConstants.PRIMARY_LOWER_BOUND;
    }
}
