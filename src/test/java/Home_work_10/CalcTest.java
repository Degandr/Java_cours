package Home_work_10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
    private final Calc calc = new Calc();

    @Test
    public void sumTest() {
        Assert.assertEquals(calc.sum(2, 3), 5);
        Assert.assertEquals(calc.sum(59, 41), 100);
        Assert.assertEquals(calc.sum(759, 1236), 1995);
        Assert.assertEquals(calc.sum(0, 3), 3);
    }

    @Test
    public void minTest() {
        Assert.assertEquals(calc.min(10, 5), 5);
        Assert.assertEquals(calc.min(59, 41), 18);
        Assert.assertEquals(calc.min(759, 1236), -477);
        Assert.assertEquals(calc.min(11, 3), 8);
    }

    @Test
    public void multTest() {
        Assert.assertEquals(calc.mult(10, 5), 50);
        Assert.assertEquals(calc.mult(59, 41), 2419);
        Assert.assertEquals(calc.mult(2, 2), 4);
        Assert.assertEquals(calc.mult(-11, 3), -33);
    }

    @Test
    public void devTest() {
        Assert.assertEquals(calc.dev(10, 5), 2);
        Assert.assertEquals(calc.dev(41, 41), 1);
        Assert.assertEquals(calc.dev(121, 11), 11);
        Assert.assertEquals(calc.dev(-12, 3), -4);
    }
}
