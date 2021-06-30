package p1;

import java.util.*;

public class Model {

    private final int SOUGHT_NUMBER = generateSoughtNumber();
    private int lowerBound;
    private int upperBound;
    private ArrayList <Integer> userAttempts = new ArrayList<>(); //stores all correct user attempts

    private static int generateSoughtNumber() {
        Random r = new Random();
        return r.nextInt(99) + 1;
    }

    public void setPrimaryBounds(int lowerBound, int upperBound){
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public int getSoughtNumber() {
        return SOUGHT_NUMBER;
    }

    public void updateAttempts(int attempt) {
        userAttempts.add(attempt);
        updateBounds(attempt);
    }

    private void updateBounds(int attempt) {
        if (attempt < SOUGHT_NUMBER) {
            lowerBound = attempt;
        } else if (attempt > SOUGHT_NUMBER) {
            upperBound = attempt;
        }
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public ArrayList<Integer> getUserAttempts() {
        return userAttempts;
    }
}
