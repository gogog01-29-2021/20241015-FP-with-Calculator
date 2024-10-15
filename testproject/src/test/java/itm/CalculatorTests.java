package itm;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Scanner;
import itm.oss.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Calculator tests of OSS class")
public class CalculatorTests{
    private final Calculator calc=new Calculator();
    @Test
    @DisplayName("Test for add function")
    void add(){
        assertEquals(10,calc.add(5,5),"Expected value of add function");
    }
    @Test
    @DisplayName("Test for number is prime")
    void isPrimeTest(){
        System.out.println("IsPrimetest Running");
        assertTrue(calc.isPrime(5),"5 is prime");
        int[] test={2,3,4,5,6,7,8,93};
        for(int i:test){
            assertTrue(calc.isPrime(i),"Error expected True got False for =>i ");

        }
    }
    @Test
    @DisplayName("test for getNextPrime")
    void getNextPrimeTest(){
        System.out.println("test is running");
        int[] test={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,71,73,79,83,89,97};
        for(int i=0;i<test.length-1;i++){
            assertTrue(calc.isPrime(i),"error expected True got false for =>");

        }
    }
    @Test
    @DisplayName("Test funcion isPrime(0)")
    void isPrime0Test(){
        System.out.println("IsPrimeTest Running");
        calc.isPrime(0);
    }
}