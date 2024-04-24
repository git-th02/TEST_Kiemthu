/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date_test;

/**
 *
 * @author ngothithom
 */
public class NextDateCalculator {
    
    public static String nextDate(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            return "Invalid date";
        }
        
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
        
        if (day == 31 && month == 12) {
            nextDay = 1;
            nextMonth = 1;
            nextYear = year + 1;
        } else if (day == 31) {
            nextDay = 1;
            nextMonth = month + 1;
        } else if (isEndOfMonth(day, month)) {
            nextDay = 1;
            nextMonth = month + 1;
        } else {
            nextDay = day + 1;
        }
        
        return String.format("%02d/%02d/%04d", nextDay, nextMonth, nextYear);
    }
    
    private static boolean isValidDate(int day, int month, int year) {
        if (year < 1812 || year > 2012) {
            return false;
        }
        
        if (month < 1 || month > 12) {
            return false;
        }
        
        if (day < 1 || day > 31) {
            return false;
        }
        
        if (day == 31 && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11)) {
            return false;
        }
        
        if (day == 30 && month == 2) {
            return false;
        }
        
        if (day == 29 && month == 2 && !isLeapYear(year)) {
            return false;
        }
        
        return true;
    }
    
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    private static boolean isEndOfMonth(int day, int month) {
        return day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)
            || day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12);
    }
    
    // main
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 2012;
        
        String nextDate = NextDateCalculator.nextDate(day, month, year);
        System.out.println("Next date: " + nextDate);
    }
}
    

//public class date {
//    
//}
