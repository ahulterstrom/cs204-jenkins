import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CalculatorTestThorough {

    @Test
    public void addTest(){
        Calculator myCalculator = new Calculator();

        for(int i = 0; i < 2000000000 ; i++){
            int firstNumber = 2000000000 - i;
            int secondNumber = i;
            assertEquals(2000000000, myCalculator.add(firstNumber,secondNumber));
        }

    }


    @Test
    public void subtractTest(){
        Calculator myCalculator = new Calculator();

        for(int i = 0; i < 2000000000 ; i++){
            int firstNumber = 2000000000 + i;
            int secondNumber = i;
            assertEquals(2000000000, myCalculator.subtract(firstNumber,secondNumber));
        }
    }

    @Test
    public void multiplyTest(){
        Calculator myCalculator = new Calculator();

       for(int i = 0; i < 2000000000 ; i++){
           assertEquals(0 , myCalculator.multiply(0 , i));
       }

    }


    @Test
    public void divideTest(){
        Calculator myCalculator = new Calculator();

        for(int i = 1; i < 2000000000 ; i++){
            assertEquals(0 , myCalculator.divide(0 , i));
        }

    }

    @Test
    public void divideByZeroFailure(){
        Calculator myCalculator = new Calculator();

        String failureMessage =  "/ by zero";
        for(int i = 1 ; i < 100000 ; i++){
            try{

                myCalculator.divide(i, 0);
                fail();
            }
            catch (ArithmeticException e){
                assertTrue(failureMessage.contains(e.getMessage()));
            }
        }

    }

    @Test
    public void fibonacciTest(){

        for(int i = 0 ; i < 10000; i++){
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
            assertEquals(34 , myCalculator.fibonacciNumberFinder(9));
            assertEquals(55 , myCalculator.fibonacciNumberFinder(10));
            assertEquals(89 , myCalculator.fibonacciNumberFinder(11));
            assertEquals(144 , myCalculator.fibonacciNumberFinder(12));
            assertEquals(233, myCalculator.fibonacciNumberFinder(13));
            assertEquals(377 , myCalculator.fibonacciNumberFinder(14));
            assertEquals(610 , myCalculator.fibonacciNumberFinder(15));
            assertEquals(987 , myCalculator.fibonacciNumberFinder(16));

            assertEquals(317811 , myCalculator.fibonacciNumberFinder(28));
        }


    }

    @Test
    public void intToBinaryNumberTest(){

        for(int i = 0 ; i < 10000; i ++){
            Calculator myCalculator = new Calculator();
            assertEquals("0" , myCalculator.intToBinaryNumber(0));
            assertEquals("1010" , myCalculator.intToBinaryNumber(10));
            assertEquals("10000" , myCalculator.intToBinaryNumber(16));
            assertEquals("10100" , myCalculator.intToBinaryNumber(20));
            assertEquals("1111100111" , myCalculator.intToBinaryNumber(999));
            assertEquals("1111111111" , myCalculator.intToBinaryNumber(1023));
        }

    }

    @Test
    public void createUniqueIDTest(){
        Calculator myCalculator = new Calculator();
        Set<String> uniqueIDBank = new HashSet<String>();

        for(int i = 0; i < 100; i++){
            uniqueIDBank.add(myCalculator.createUniqueID("CS204"));
        }

        assertEquals(100 , uniqueIDBank.size());

        for(String targetString:uniqueIDBank){
            assertTrue(targetString.contains("CS204"));
        }

    }



}
