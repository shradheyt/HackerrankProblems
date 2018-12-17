package com.shradhey;

import java.io.IOException;

/**
 * Created by Shradhey Tripathi on 12/17/2018
 */
public class MinimumDistance {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<a.length;i++) {
            for(int j = i+1;j<a.length;j++) {
                if(a[i] == a[j]) {
                    if(Math.abs(j - i) < min)
                    {
                        min = Math.abs(j - i);
                    }
                }
            }
        }
        if(min == Integer.MAX_VALUE) return -1;
        return min;

    }


    public static void main(String[] args) throws IOException {
       int arr[] = {7,1,3,4,1,7};
        System.out.println(minimumDistances(arr));
    }
}
