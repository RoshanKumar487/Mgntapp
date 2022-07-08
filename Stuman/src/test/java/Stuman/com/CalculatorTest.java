package Stuman.com;

import Stuman.com.Junit.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @Disabled
    public void testAdd(){
        Calculator calc= new Calculator();
        Integer c = calc.add(10,20);
        assertEquals(30, c);
    }


}
