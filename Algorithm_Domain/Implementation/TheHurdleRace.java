package com.shradhey;


import java.util.*;

public class TheHurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }

        Arrays.sort(height);
        int max =  height[height.length - 1];
        if(max > k)
            System.out.println(max - k);
        else
            System.out.println(0);

    }
}
