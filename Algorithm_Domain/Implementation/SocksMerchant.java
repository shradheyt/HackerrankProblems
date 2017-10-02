package com.shradhey;

import java.util.*;


public class SocksMerchant {

    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        Arrays.sort(ar);

        for(int i = 0;i < ar.length - 1;i++)
        {
            if(ar[i] == ar[i+1])
            {
                i++;
                count++;
                continue;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
