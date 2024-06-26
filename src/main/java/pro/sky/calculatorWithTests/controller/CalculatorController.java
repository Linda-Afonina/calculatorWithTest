package pro.sky.calculatorWithTests.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculatorWithTests.service.CalculatorService;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("plus")
    public String getSum(@RequestParam("num1") Integer num1,
                         @RequestParam("num2") Integer num2) {
        return calculatorService.getSum(num1, num2);
    }

    @GetMapping("minus")
    public String getDifference(@RequestParam("num1") Integer num1,
                                @RequestParam("num2") Integer num2) {
        return calculatorService.getDifference(num1, num2);
    }

    @GetMapping("multiply")
    public String getMultiplication(@RequestParam("num1") Integer num1,
                                    @RequestParam("num2") Integer num2) {
        return calculatorService.getMultiplication(num1, num2);
    }

    @GetMapping("divide")
    public String getDivision(@RequestParam("num1") Integer num1,
                              @RequestParam("num2") Integer num2) {
        return calculatorService.getDivision(num1, num2);
    }
}
