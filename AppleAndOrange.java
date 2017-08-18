package com.shradhey;


import java.util.*;

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int applecount=0,orangecount=0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if((a + apple[apple_i]) >= s && (a + apple[apple_i]) <= t )
                applecount++;

        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if((b + orange[orange_i]) >= s && (b + orange[orange_i]) <= t )
                orangecount++;
        }
        System.out.println(applecount);
        System.out.println(orangecount);

    }
}
