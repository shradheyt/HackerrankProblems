package com.shradhey;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class ElectronicShop {

    static int getMoneySpent(Integer[] keyboards, Integer[] drives, int s){
        int sum = -1;
        int temp;
        Arrays.sort(keyboards,Collections.reverseOrder());
        Arrays.sort(drives,Collections.reverseOrder());

        for(int i = 0;i < keyboards.length;i++)
        {
            for(int j = 0;j < drives.length;j++)
            {
                temp = keyboards[i]+drives[j];
                if(temp <= s && temp > sum)
                    sum = temp;

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[] keyboards = new Integer[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        Integer[] drives = new Integer[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }

        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
