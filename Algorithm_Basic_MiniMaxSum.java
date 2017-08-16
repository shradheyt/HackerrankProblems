package com.shradhey;


import java.util.*;


public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long sum = 0;
        long temp = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            sum = sum + arr[arr_i];
        }

        for(int i=0;i < 5;i++)
        {
            temp = sum - arr[i];
            if(max < temp)
                max = temp;
            if(min > temp)
                min = temp;

        }
        System.out.print(min + " " + max);
    }
}