package Test;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import p1.Arithmetics;

public class TestArithmetics {
    private static Arithmetics a;

    @Rule
    public final ExpectedException EXP = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static void runT() {
        a = new Arithmetics();
    }

    @Test
    public void testAdd() {
        double res = a.add(3, 7);
        //Assert.assertNotNull(a);
        Assert.assertTrue(res == 10.0);
    }

    @Test
    public void testMult() {
        double res = a.mult(3, 7);
        Assert.assertTrue(res == 21.0);
    }

    @Ignore
    @Test
    public void testDeduct() {
        double res = a.deduct(3, 7);
        Assert.assertTrue(res == -4.0);
    }

    @Test
    public void testDiv() {
        double res = a.div(10, 5);;
        Assert.assertTrue(res == 2.0);
        /*try {
            a.div(10, 0);
            Assert.fail();
        } catch (ArithmeticException ae) { }*/
    }

    //@Test(expected = ArithmeticException.class)
    @Test
    public void TestDivException() {
        EXP.expect(ArithmeticException.class);
        a.div(10, 0);
    }

    //@Test(timeout = 1000)
    @Test
    public void testN() {
        /*while (true) {

        }*/
    }
}
