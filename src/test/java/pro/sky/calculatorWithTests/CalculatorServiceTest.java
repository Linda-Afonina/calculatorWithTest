package pro.sky.calculatorWithTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.calculatorWithTests.service.CalculatorService;
import pro.sky.calculatorWithTests.service.impl.CalculatorServiceImpl;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    Integer num1;
    Integer num2;
    Integer num3;
    Integer num4;
    CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        num1 = 5;
        num2 = 5;
        num3 = 90;
        num4 = 2;
        calculatorService = new CalculatorServiceImpl();
    }

    @Test
    public void hello() {
        String actual = calculatorService.hello();
        String expected = "Добро пожаловать в калькулятор";
        assertEquals(actual, expected);

    }

    @Test
    public void getSum() {
        String actual1 = calculatorService.getSum(num1, num2);
        String expected1 = "5 + 5 = 10";
        assertEquals(actual1, expected1);

        String actual2 = calculatorService.getSum(num3, num4);
        String expected2 = "90 + 2 = 92";
        assertEquals(actual2, expected2);
    }

    @Test
    public void getDeference() {
        String actual1 = calculatorService.getDifference(num1, num2);
        String expected1 = "5 - 5 = 0";
        assertEquals(actual1, expected1);

        String actual2 = calculatorService.getDifference(num3, num4);
        String expected2 = "90 - 2 = 88";
        assertEquals(actual2, expected2);
    }

    @Test
    public void getMultiply() {
        String actual1 = calculatorService.getMultiplication(num1, num2);
        String expected1 = "5 * 5 = 25";
        assertEquals(actual1, expected1);

        String actual2 = calculatorService.getMultiplication(num3, num4);
        String expected2 = "90 * 2 = 180";
        assertEquals(actual2, expected2);
    }

    @Test
    public void getDivision() {
        String actual1 = calculatorService.getDivision(num1, num2);
        String expected1 = "5 / 5 = 1";
        assertEquals(actual1, expected1);

        String actual2 = calculatorService.getDivision(num3, num4);
        String expected2 = "90 / 2 = 45";
        assertEquals(actual2, expected2);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNum2IsNull() {
        num2 = 0;
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.getDivision(num1, num2),
                "делить на ноль нельзя!");
    }
}
