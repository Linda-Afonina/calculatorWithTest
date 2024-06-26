package pro.sky.calculatorWithTests.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.calculatorWithTests.exceptions.NullParameterException;
import pro.sky.calculatorWithTests.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String getSum(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullParameterException("Введите данные");
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String getDifference(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullParameterException("Введите данные");
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String getMultiplication(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullParameterException("Введите данные");
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String getDivision(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullParameterException("Введите данные");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("делить на ноль нельзя!");
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
