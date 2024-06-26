package pro.sky.calculatorWithTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculatorWithTests.service.CalculatorService;
import pro.sky.calculatorWithTests.service.impl.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParameterizedTest {

    CalculatorService out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForPlusTests() {
        return Stream.of(
                Arguments.of(5, 5, "5 + 5 = 10"),
                Arguments.of(54, 98, "54 + 98 = 152"),
                Arguments.of(44, 77, "44 + 77 = 121")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPlusTests")
    public void shouldGenerateCorrectPlusResult(Integer num1, Integer num2, String result) {
        String actual = out.getSum(num1, num2);
        String expected = result;
        assertEquals(actual, expected);
    }

    public static Stream<Arguments> provideParamsForMinusTests() {
        return Stream.of(
                Arguments.of(5, 5, "5 - 5 = 0"),
                Arguments.of(104, 98, "104 - 98 = 6"),
                Arguments.of(44, 11, "44 - 11 = 33")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTests")
    public void shouldGenerateCorrectMinusResult(Integer num1, Integer num2, String result) {
        String actual = out.getDifference(num1, num2);
        String expected = result;
        assertEquals(actual, expected);
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of(5, 5, "5 * 5 = 25"),
                Arguments.of(10, 98, "10 * 98 = 980"),
                Arguments.of(11, 11, "11 * 11 = 121")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void shouldGenerateCorrectMultiplyResult(Integer num1, Integer num2, String result) {
        String actual = out.getMultiplication(num1, num2);
        String expected = result;
        assertEquals(actual, expected);
    }

    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of(5, 5, "5 / 5 = 1"),
                Arguments.of(10, 5, "10 / 5 = 2"),
                Arguments.of(121, 11, "121 / 11 = 11")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void shouldGenerateCorrectDivideResult(Integer num1, Integer num2, String result) {
        String actual = out.getDivision(num1, num2);
        String expected = result;
        assertEquals(actual, expected);
    }
}
