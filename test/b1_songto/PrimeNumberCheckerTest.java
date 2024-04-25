package b1_songto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import b1_songt.PrimeNumberChecker;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ngothithom
 */
//import org.junit.jupiter.api.Test;


public class PrimeNumberCheckerTest {

    @Test
    public void testIsPrime_PrimeNumber() {
        int number = 7;
        boolean expectedResult = true;
        boolean actualResult = PrimeNumberChecker.isPrime(number);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPrime_NonPrimeNumber() {
        int number = 10;
        boolean expectedResult = false;
        boolean actualResult = PrimeNumberChecker.isPrime(number);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPrime_NegativeNumber() {
        int number = -5;
        boolean expectedResult = false;
        boolean actualResult = PrimeNumberChecker.isPrime(number);

        assertEquals(expectedResult, actualResult);
    }
}
