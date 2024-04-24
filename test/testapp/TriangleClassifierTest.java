///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
// */
//package testapp;
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author ngothithom
// */
//public class tamgiacTest {
//    
//    public void testEquilateralTriangle() {
//        int a = 5;
//        int b = 5;
//        int c = 5;
//        
//        String expectedType = "Equilateral";
//        String actualType = tamgiac.isTamgiac(a, b, c);
//        assertEquals(expectedType, actualType);
//    }
//    public void testIsoscelesTriangle() {
//        int a = 5;
//        int b = 5;
//        int c = 8;
//        
//        String expectedType = "Isosceles";
//        String actualType = tamgiac.isTamgiac(a, b, c);
//        assertEquals(expectedType, actualType);
//    }
//    public void testScaleneTriangle() {
//        int a = 3;
//        int b = 4;
//        int c = 5;
//        
//        String expectedType = "Scalene";
//        String actualType = tamgiac.isTamgiac(a, b, c);
//        assertEquals(expectedType, actualType);
//    }
//    public void testRightTriangle() {
//        int a = 3;
//        int b = 4;
//        int c = 5;
//        
//        String expectedType = "Right triangle";
//        String actualType = tamgiac.isTamgiac(a, b, c);
//        assertEquals(expectedType, actualType);
//    }
//    public void testNotATriangle() {
//        int a = 1;
//        int b = 2;
//        int c = 6;
//        
//        String expectedType = "NotATriangle";
//        String actualType = tamgiac.isTamgiac(a, b, c);
//        assertEquals(expectedType, actualType);
//    }
////    public tamgiacTest() {
////    }
////
////    @Test
////    public void testMain() {
////    }
//    
//}
package testapp;
import org.junit.Test;
import static org.junit.Assert.*;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {

    @Test
    public void testEquilateralTriangle() {
        int side1 = 5;
        int side2 = 5;
        int side3 = 5;

        String expectedType = "Equilateral";
        String actualType = TriangleClassifier.classifyTriangle(side1, side2, side3);

        assertEquals(expectedType, actualType);
    }

    @Test
    public void testIsoscelesTriangle() {
        int side1 = 5;
        int side2 = 5;
        int side3 = 8;

        String expectedType = "Isosceles";
        String actualType = TriangleClassifier.classifyTriangle(side1, side2, side3);

        assertEquals(expectedType, actualType);
    }

    @Test
    public void testScaleneTriangle() {
        int side1 = 7;
        int side2 = 9;
        int side3 = 12;

        String expectedType = "Scalene";
        String actualType = TriangleClassifier.classifyTriangle(side1, side2, side3);

        assertEquals(expectedType, actualType);
    }

    @Test
    public void testRightTriangle() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        String expectedType = "Right triangle";
        String actualType = TriangleClassifier.classifyTriangle(side1, side2, side3);

        assertEquals(expectedType, actualType);
    }

    @Test
    public void testNotATriangle() {
        int side1 = 1;
        int side2 = 2;
        int side3 = 6;

        String expectedType = "NotATriangle";
        String actualType = TriangleClassifier.classifyTriangle(side1, side2, side3);

        assertEquals(expectedType, actualType);
    }
}