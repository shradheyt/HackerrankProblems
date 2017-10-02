package com.shradhey;

import java.util.*;

public class JumpingOnTheCloudsRevisited {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int jump;
        int E = 100;
        for(int i = 0;i < n;i = jump)
        {
            jump = (i + k) % n;

            if(c[jump] == 1)
            {
                E = E - 2;
            }

            E = E - 1;
            if(jump == 0)
                break;
        }
        System.out.println(E);
    }
}
