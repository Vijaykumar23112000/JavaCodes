package Algorithms;

/*
 * Given an integer input for the year, the objective is to check whether or not the user given input “year” is a Leap year or not
 * 
 * Input : 2024
 * Output: Leap Year
 */

class LeapYear {

    public static boolean isLeapYear(int year) {

        return year % 400 ==0 ? true : year % 4==0 && year % 100 != 0 ? true : false;

    }

    public static void main(String[] args) {

        int year = 2024;
        isLeapYear(year);
    }
}