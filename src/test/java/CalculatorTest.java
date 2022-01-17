import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator myCalculator = new Calculator();

        assertEquals(6 , myCalculator.add(2,4));
        assertEquals(6 , myCalculator.add(3,3));
        assertEquals(6 , myCalculator.add(0,6));
        assertEquals(6 , myCalculator.add(7,-1));
        assertEquals( -6, myCalculator.add(-3,-3));

    }


    @Test
    public void subtractTest(){
        Calculator myCalculator = new Calculator();

        assertEquals(-2 , myCalculator.subtract(2,4));
        assertEquals(2 , myCalculator.subtract(4,2));
        assertEquals(-4 , myCalculator.subtract(0,4));
        assertEquals(99999 , myCalculator.subtract(100000,1));

    }

    @Test
    public void multiplyTest(){
        Calculator myCalculator = new Calculator();

        assertEquals(8 , myCalculator.multiply(2,4));
        assertEquals(8 , myCalculator.multiply(4,2));
        assertEquals(-4 , myCalculator.multiply(-1,4));
        assertEquals(0 , myCalculator.multiply(0,4));
        assertEquals(400 , myCalculator.multiply(100,4));

    }


    @Test
    public void divideTest(){
        Calculator myCalculator = new Calculator();

        assertEquals(0 , myCalculator.divide(2,4));
        assertEquals(2 , myCalculator.divide(4,2));
        assertEquals(50 , myCalculator.divide(100,2));
        assertEquals(25 , myCalculator.divide(50,2));
        assertEquals(1 , myCalculator.divide(3,2));

    }

    @Test
    public void divideByZeroFailure(){
        Calculator myCalculator = new Calculator();

        String failureMessage =  "/ by zero";

        try{
            myCalculator.divide(5, 0);
            fail();
        }
        catch (ArithmeticException e){
            assertTrue(failureMessage.contains(e.getMessage()));
        }


    }

    @Test
    public void fibonacciTest(){
        Calculator myCalculator = new Calculator();

        assertEquals(0 , myCalculator.fibonacciNumberFinder(0));
        assertEquals(1 , myCalculator.fibonacciNumberFinder(1));
        assertEquals(1 , myCalculator.fibonacciNumberFinder(2));
        assertEquals(2 , myCalculator.fibonacciNumberFinder(3));
        assertEquals(3 , myCalculator.fibonacciNumberFinder(4));
        assertEquals(5 , myCalculator.fibonacciNumberFinder(5));
        assertEquals(8 , myCalculator.fibonacciNumberFinder(6));
        assertEquals(13 , myCalculator.fibonacciNumberFinder(7));
        assertEquals(21 , myCalculator.fibonacciNumberFinder(8));
        assertEquals(317811 , myCalculator.fibonacciNumberFinder(28));

    }

    @Test
    public void intToBinaryNumberTest(){
        Calculator myCalculator = new Calculator();

        assertEquals("0" , myCalculator.intToBinaryNumber(0));
        assertEquals("1010" , myCalculator.intToBinaryNumber(10));
        assertEquals("10000" , myCalculator.intToBinaryNumber(16));
        assertEquals("10100" , myCalculator.intToBinaryNumber(20));
        assertEquals("1111100111" , myCalculator.intToBinaryNumber(999));
        assertEquals("1111111111" , myCalculator.intToBinaryNumber(1023));

    }

    @Test
    public void createUniqueIDTest(){
        Calculator myCalculator = new Calculator();
        Set<String> uniqueIDBank = new HashSet<String>();

        for(int i = 0; i < 10; i++){
            uniqueIDBank.add(myCalculator.createUniqueID("CS204"));
        }

        assertEquals(10 , uniqueIDBank.size());

        for(String targetString:uniqueIDBank){
            assertTrue(targetString.contains("CS204"));
        }

    }


}
