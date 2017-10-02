package com.shradhey;

import java.util.*;


public class DayOfTheProgrammer {

    public static boolean isLeapYear(int year)
    {
        if(year > 1918 && year <=2700)
        {
            if(year % 400 == 0)
                return true;
            else if(year % 4 == 0 && year % 100 != 0)
                return true;
            else
                return false;
        }
        else if(year >= 1700 && year <1918)
        {
            if(year % 4 == 0)
                return true;
            return false;
        }
        else
            return false;
    }

    static String solve(int year){
        int noOfDays;
        int sum = 0;
        int month = 0;
        int day = 0;
        int[] arrayDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeapYear(year))
            arrayDays[1] += 1;

        if(year == 1918)
            arrayDays[1] = 15;
        for(int i = 0;i < arrayDays.length;i++)
        {
            noOfDays = sum;
            sum = sum +arrayDays[i];
            month = i+1;
            if(sum > 256)
            {
                day = 256 - noOfDays;
                break;
            }
        }

        StringBuilder date = new StringBuilder(11);
        if(day > 9)
            date.append(day);
        else if(day <= 10)
            date.append("0"+day);

        date.append(".");

        if(month > 9)
            date.append(month);
        else if(month <= 10)
            date.append("0"+month);

        date.append(".");
        date.append(year);

        return date.toString();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
