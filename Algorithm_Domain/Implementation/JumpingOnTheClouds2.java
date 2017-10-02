package com.shradhey;


import java.util.*;


public class JumpingOnTheClouds2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int count = 0;
        int jump;
        for(int i = 0;i < n;i = jump)
        {

            if(i + 2 <= (n - 1) && c[i + 2] == 0)
                jump = (i + 2) % (n - 1);
            else jump = (i + 1) % (n - 1);
            count++;
            if(jump == 0)
                break;
        }
        System.out.println(count);
    }


}
