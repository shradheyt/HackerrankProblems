package com.shradhey;

import java.util.*;


public class PickingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int max = 0;
        int maxNum = 0;
        int frequency[] = new int[100];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            frequency[a[a_i]]++;
            if(maxNum < a[a_i])
                maxNum = a[a_i];
        }

        for(int i = 0; i < maxNum; i++)
        {
            if(frequency[i] + frequency[i + 1] > max)
                max = frequency[i] + frequency[i + 1];
        }
        System.out.println(max);
    }
}
