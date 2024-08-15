package br.com.erudio.math;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

public class SimpleMath {
    private final AtomicLong counter = new AtomicLong();

    public Double sum(
            Double numberOne,
            Double numberTwo) throws Exception {

        return numberOne + numberTwo;
    }

    public Double subtraction(
            Double numberOne,
            Double numberTwo
    ){

        return numberOne - numberTwo;
    }

    public Double multiplication(
            Double numberOne,
            Double numberTwo
    ){

        return numberOne * numberTwo;
    }

    public Double division(
            Double numberOne,
            Double numberTwo
    ){

        return numberOne / numberTwo;
    }

    public Double squareRoot(
            Double number
    ){

        return Math.sqrt(number);
    }

    public Double mean(
            Double numberOne,
            Double numberTwo
    ){

        return (numberOne + numberTwo)/2;
    }

}
