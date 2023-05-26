package ec.edu.apt.tdd.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;

    @Before
    public void setUp() {
        c = new Calculator();
        System.out.println("Setup()");
    }

    @Test
    public void given_two_integers_when_addition_then_ok(){
        assertEquals(6,c.addition(4,2));
        System.out.println("Test 1");
    }

    @Test
    public void given_two_integers_when_subtraction_then(){
        assertEquals(2, c.subtraction(4,2));
        System.out.println("Test 2");
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception(){
        assertEquals(3, c.division(6,0));
        System.out.println("Test 3");
    }

    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_timeout(){
        assertEquals(8, c.multiplication(4,2));
        System.out.println("Test 4");
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        c.setAns(0);
        c = null;
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }
}
