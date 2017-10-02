package com.shradhey;


import java.util.*;


public class CutTheSticks {

    public static int findMin(int[] a)
    {
        int min = Integer.MAX_VALUE;
        int zerocount = 0;
        for(int i = 0;i < a.length;i++)
        {
            if(a[i] == 0)
                zerocount++;
            if(min > a[i])
                min = a[i];
        }
        if(zerocount == a.length)
            return 0;
        return min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int min = findMin(arr);
        System.out.println(n);
        while(min > 0 && min <= 1000)
        {
            int count = 0;
            for(int i = 0;i < n;i++)
            {
                if(arr[i] == 0 || arr[i] > 1000)
                    continue;
                arr[i] = arr[i] - min;
                if(arr[i] > 0 && arr[i] < 1000)
                    count++;
                else
                    arr[i] = 100000;
            }
            min = findMin(arr);
            if(count == 0)
            {
                break;
            }

            System.out.println(count);


        }


    }
}
