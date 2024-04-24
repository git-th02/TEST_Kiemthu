/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package date_test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ngothithom
 */


public class NextDateCalculatorTest {

    @Test
    public void testNextDate_EndOfMonth() {
        int day = 30;
        int month = 4;
        int year = 2022;

        String expectedDate = "01/05/2022";
        String actualDate = NextDateCalculator.nextDate(day, month, year);

        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testNextDate_EndOfYear() {
        int day = 31;
        int month = 12;
        int year = 2021;

        String expectedDate = "01/01/2022";
        String actualDate = NextDateCalculator.nextDate(day, month, year);

        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testNextDate_LeapYear() {
        int day = 28;
        int month = 2;
        int year = 2020;

        String expectedDate = "29/02/2020";
        String actualDate = NextDateCalculator.nextDate(day, month, year);

        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testNextDate_InvalidDate() {
        int day = 31;
        int month = 2;
        int year = 2021;

        String expectedDate = "Invalid date";
        String actualDate = NextDateCalculator.nextDate(day, month, year);

        assertEquals(expectedDate, actualDate);
    }
}
//public class NextDateCalculatorTest {
//    
//    public NextDateCalculatorTest() {
//    }
//
//    @Test
//    public void testNextDate() {
//    }
//
//    @Test
//    public void testMain() {
//    }
//    
//}
