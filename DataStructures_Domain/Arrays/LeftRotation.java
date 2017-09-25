package com.shradhey.DS;


import java.util.*;

public class LeftRotation {

    static int[] leftRotation(int[] a, int d) {

        int[] temp = new int[a.length];
        int n = a.length;
        for(int i = 0;i < n;i++)
        {

            temp[i] = a[(d + i) % n];

        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
