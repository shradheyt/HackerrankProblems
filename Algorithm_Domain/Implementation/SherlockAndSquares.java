package com.shradhey;

import java.util.*;


public class SherlockAndSquares {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] count = new int[T];
        for(int t = 0;t < T;t++)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();

            double rootA = Math.sqrt(A);
            double rootB = Math.sqrt(B);
            if(rootA == rootB)
            {
                count[t] = (int)Math.floor(rootB) - (int)Math.ceil(rootA) + 1;
            }
            else if((int)rootA == (int)rootB)
            {
                count[t] = 0;
            }
            else
                count[t] = (int)Math.floor(rootB) - (int)Math.ceil(rootA) + 1;
        }
        for(int t = 0;t < T;t++)
        {
            System.out.println(count[t]);
        }



    }
}