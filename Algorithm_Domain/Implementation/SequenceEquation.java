package com.shradhey;

import java.util.*;


public class SequenceEquation {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[51];
        int count = 0;
        for(int i = 0;i < n;i++)
        {
            int nVal= sc.nextInt();
            a[nVal] = i+1;
            count++;
        }
        for(int j = 1;j <= count;j++)
        {
            System.out.println(a[a[j]]);
        }
    }
}
