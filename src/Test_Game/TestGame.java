package Test_Game;

import p1.Model;
import org.junit.*;

public class TestGame {
    public static Model model;

    @BeforeClass
    public static void createModelObject() {
        model = new Model();
    }

    @Test
    public void testNumberGenerator() {
        int random = model.getSoughtNumber();
        Assert.assertTrue(random >= 0 && random <= 100);
    }
}
