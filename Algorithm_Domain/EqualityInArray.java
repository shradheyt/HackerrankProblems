package com.shradhey;


import java.util.*;


public class EqualityInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        int[] hash = new int[101];
        int max = -1;
        int maxFreq = -1;
        int countOfOne = 0;
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] > max)
                max = arr[i];
            hash[arr[i]]++;
        }
        for(int i = 0;i <= max;i++)
        {
            if(hash[i] > maxFreq)
                maxFreq = hash[i];
            if(hash[i] == 1)
                countOfOne++;
        }
        if(countOfOne == n)
            System.out.println(n - 1);
        else
            System.out.println(n - maxFreq);


    }
}