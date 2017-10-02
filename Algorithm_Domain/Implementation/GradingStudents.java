package com.shradhey;

import java.util.*;


public class GradingStudents {

    static int[] solve(int[] grades){
        int size = grades.length;
        int[] result = new int[size];
        int temp=0;
        for (int i = 0;i < size;i++)
        {
            if(grades[i] >= 38)
            {
                temp=5 - (grades[i] % 5);
                if(temp < 3)
                    result[i] = grades[i] + temp;
                if(temp == 3 || temp > 3)
                    result[i] = grades[i];

            }
            else
            {
                result[i] = grades [i];
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
