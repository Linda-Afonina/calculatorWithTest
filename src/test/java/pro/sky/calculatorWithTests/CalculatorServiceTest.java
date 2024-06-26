package pro.sky.calculatorWithTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.calculatorWithTests.service.CalculatorService;
import pro.sky.calculatorWithTests.service.impl.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    Integer num1;
    Integer num2;
    Integer num3;
    Integer num4;
    CalculatorService out;

    @BeforeEach
    public void setUp() {
        num1 = 5;
        num2 = 5;
        num3 = 90;
        num4 = 2;
        out = new CalculatorServiceImpl();
    }

    @Test
    public void hello() {
        String actual = out.hello();
        String expected = "Добро пожаловать в калькулятор";
        assertEquals(actual, expected);

    }

    @Test
    public void getSum() {
        String actual1 = out.getSum(num1, num2);
        String expected1 = "5 + 5 = 10";
        assertEquals(actual1, expected1);

        String actual2 = out.getSum(num3, num4);
        String expected2 = "90 + 2 = 92";
        assertEquals(actual2, expected2);
    }

    @Test
    public void getDeference() {
        String actual1 = out.getDifference(num1, num2);
        String expected1 = "5 - 5 = 0";
        assertEquals(actual1, expected1);

        String actual2 = out.getDifference(num3, num4);
        String expected2 = "90 - 2 = 88";
        assertEquals(actual2, expected2);
    }

    @Test
    public void getMultiply() {
        String actual1 = out.getMultiplication(num1, num2);
        String expected1 = "5 * 5 = 25";
        assertEquals(actual1, expected1);

        String actual2 = out.getMultiplication(num3, num4);
        String expected2 = "90 * 2 = 180";
        assertEquals(actual2, expected2);
    }

    @Test
    public void getDivision() {
        String actual1 = out.getDivision(num1, num2);
        String expected1 = "5 / 5 = 1";
        assertEquals(actual1, expected1);

        String actual2 = out.getDivision(num3, num4);
        String expected2 = "90 / 2 = 45";
        assertEquals(actual2, expected2);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNum2IsNull() {
        num2 = 0;
        assertThrows(IllegalArgumentException.class,
                () -> out.getDivision(num1, num2),
                "делить на ноль нельзя!");
    }
}
