package Testing;

import input_form.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;

public class Tests {
    static Controller controller;
    String surnameForInput = "Koval";
    String nicknameForInput = "dds45";
    boolean isValid;    // this variable is needed for testSurnameProcessing and testNicknameProcessing

    @BeforeClass
    public static void initController() {
        controller = new Controller(new View(), new Model());
    }

    @Test
    public void testInitCapital() {
        String beforeCapital = surnameForInput.toLowerCase();
        String afterCapital = InitCapitalLetter.initCapital(surnameForInput);

        Assert.assertTrue(beforeCapital.substring(0, 1).toUpperCase()
                .equals(afterCapital.substring(0, 1)));
    }

    @Test
    public void testSurnameValidator() {
        Assert.assertTrue(controller.surnameIsValid(
                InitCapitalLetter.initCapital(surnameForInput)));
    }

    @Test
    public void testNicknameValidator() {
        Assert.assertTrue(controller.nicknameIsValid(nicknameForInput));
    }

    /**
     * testSurnameProcessing is meant to check processSurname in input_form.Controller class.
     * It imitates java.util.Scanner work by passing surnameForInput as System.in.
     * If you want to execute this test, make sure processSurname method has
     * a public access modifier.
     */

    /*@Test
    public void testSurnameProcessing() {
        try {
            System.setIn(new ByteArrayInputStream(surnameForInput.getBytes()));
            controller.processSurname();
            isValid = true;
        } catch (NoSuchElementException e) {
            isValid = false;
        } finally {
            Assert.assertTrue(isValid);
        }
    }*/

    /**
     * testNicknameProcessing is meant to check processNickname in input_form.Controller class.
     * It imitates java.util.Scanner work by passing nicknameForInput as System.in.
     * If you want to execute this test, make sure processNickname method has
     * a public access modifier.
     */

    /*@Test
    public void testNicknameProcessing() {
        try {
            System.setIn(new ByteArrayInputStream(nicknameForInput.getBytes()));
            controller.processNickname();
            isValid = true;
        } catch (NoSuchElementException e) {
            isValid = false;
        } finally {
            Assert.assertTrue(isValid);
        }
    }*/
}
