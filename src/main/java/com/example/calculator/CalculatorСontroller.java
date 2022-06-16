package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorСontroller {

    private final CalculatorServis calculatorServis;

    public CalculatorСontroller(CalculatorServis calculatorServis) {
        this.calculatorServis = calculatorServis;
    }

    @GetMapping
    public String greeting(){
        return calculatorServis.greeting();
    }

    @GetMapping("/plus")
    public String addition(@RequestParam(value = "num1", required = false) String num1, @RequestParam(value = "num2", required = false) String num2) {
        return calculatorServis.addition(num1,num2);

    }

    @GetMapping("/minus")
    public String subtraction(@RequestParam(value = "num1", required = false) String num1, @RequestParam(value = "num2", required = false) String num2) {
        return calculatorServis.subtraction(num1,num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) String num1, @RequestParam(value = "num2", required = false) String num2) {
        return calculatorServis.multiply(num1,num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) String num1, @RequestParam(value = "num2", required = false) String num2) {
        return calculatorServis.divide(num1,num2);
    }
}
