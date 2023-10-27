import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
    private Main calculator;

    @Before
    public void setup()
    {
        calculator = new Main();
    }

    @Test
    public void test_add_positive()
    {
        int a = 1;
        int b = 2;
        int expectedResult = 3;
        int temp = calculator.add(a, b);
        Assert.assertEquals(expectedResult, temp);
    }
    
    @Test
    public void test_add_negative()
    {
        int a = 1;
        int b = 2;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.add(a, b));
    }
}