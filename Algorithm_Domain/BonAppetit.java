package com.shradhey;
import java.io.*;
import java.util.*;

public class BonAppetit {

    static void bonAppetit(int n, int k, int b, int[] ar) {

        int actual=0;
        int sum = 0;
        for(int i = 0;i < n;i++)
        {
            if(i == k)
            {
                continue;
            }
            sum = sum + ar[i];
        }
        actual = sum/2;
        if(actual == b)
        {
            System.out.println("Bon Appetit");
        }
        else
        {
            System.out.println(b - actual);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        bonAppetit(n, k, b, ar);

    }
}
