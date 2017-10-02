package com.shradhey;

import java.io.*;
import java.util.*;

public class UtopianTree {

    public static void main(String[] args) {

        int[] arr = new int[60];
        arr[0] = 1;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            for(int i = 1;i <= n;i++)
            {
                if(i%2 == 0)
                    arr[i] = arr[i - 1] + 1;
                else
                    arr[i] = arr[i - 1] * 2;
            }
            System.out.println(arr[n]);

        }

    }
}
