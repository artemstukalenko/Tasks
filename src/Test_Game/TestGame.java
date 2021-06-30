package Test_Game;

import p1.GlobalConstants;
import p1.Model;
import org.junit.*;

public class TestGame {
    public static Model model;

    @BeforeClass
    public static void createModelObject() {
        model = new Model();
        model.setPrimaryBounds(GlobalConstants.PRIMARY_LOWER_BOUND, GlobalConstants.PRIMARY_UPPER_BOUND);
    }

    @Test
    public void testNumberGenerator() {
        int random = model.getSoughtNumber();
        Assert.assertTrue(random >= 0 && random <= 100);
    }

    @Test
    public void testLowerBound() {
        int lowerBound = model.getLowerBound();
        Assert.assertTrue(lowerBound >= 0 && lowerBound < model.getUpperBound());
    }

    @Test
    public void testUpperBound() {
        int upperBound = model.getUpperBound();
        Assert.assertTrue(upperBound <= 100 && upperBound > model.getLowerBound());
    }

    @Test
    public void testAttemptsUniqueness() {
        for(int attempt : model.getUserAttempts()) {
            for (int check : model.getUserAttempts()) {
                System.out.println("attempt = " + attempt + "; check = " + check);
                Assert.assertFalse(attempt == check);
            }
        }
    }
}
