package com.shradhey;


import java.util.*;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        int[] hash = new int[6];
        int max = Integer.MIN_VALUE;
        int common = 0;
        for(int i = 0;i < n;i++)
        {
            hash[ar[i]]++;
        }
        for(int j = 1;j < 6;j++)
        {
            if(max < hash[j])
            {
                max = hash[j];
                common = j;
            }

        }
        return common;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
