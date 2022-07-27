package com.example.calculator.servis;

import com.example.calculator.servis.CalculatorServis;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServisImpl implements CalculatorServis {

    @Override
    public String greeting(){
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String addition(String num1,String num2) {
        if(checkParametrs(num1,num2) != null){
            return checkParametrs(num1,num2);
        }
        return num1 + " + " + num2 + " = " + (Integer.parseInt(num1) + Integer.parseInt(num2));
    }

    @Override
    public String subtraction(String num1,String num2) {
        if(checkParametrs(num1,num2) != null){
            return checkParametrs(num1,num2);
        }
        return num1 + " - " + num2 + " = " + (Integer.parseInt(num1) - Integer.parseInt(num2));
    }

    @Override
    public String multiply(String num1,String num2) {
        if(checkParametrs(num1,num2) != null){
            return checkParametrs(num1,num2);
        }
        return num1 + " * " + num2 + " = " + (Integer.parseInt(num1) * Integer.parseInt(num2));
    }

    @Override
    public String divide(String num1,String num2) {
        if(checkParametrs(num1,num2) != null){
            return checkParametrs(num1,num2);
        }
        if(Integer.parseInt(num2) == 0){
            throw new IllegalArgumentException("На ноль делить нельзя");
        } else {
            return num1 + " / " + num2 + " = " + ((double)Integer.parseInt(num1) / (double)Integer.parseInt(num2));
        }
    }

    private String checkParametrs(String num1,String num2){
        if(num1 == null && num2 == null){
            return "Отсутствуют необходимые параметры";
        }else if(num1 == null){
            return "Отсутствует параметр 1";
        }else if(num2 == null){
            return "Отсутствует параметр 2";
        }else if(!isDigit(num1) && !isDigit(num2)){
            return "Параметры не являются целыми числами";
        }else if(!isDigit(num1)){
            return "Параметр 1 не является целым числом";
        }else if(!isDigit(num2)){
            return "Параметр 2 не является целым числом";
        }
        return null;
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
