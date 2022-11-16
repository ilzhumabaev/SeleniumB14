package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertion {
    public int multiplication (int number1, int number2) {
        return number1 * number2;
    }

    @Test
    public void ValidateMultiplication() {
        int actualResult = multiplication(3,4);
        int expectedResult = 12;
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void validateZero() {
        int actual = multiplication(0,9999);
        int expected = 0;
        Assert.assertEquals(actual,expected);


    }
}
