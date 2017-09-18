package com.shradhey;

import java.util.*;


public class SaveThePrisoner {

    static int saveThePrisoner(int n, int m, int s){
        int lastP = (s + m -1);
        if(lastP % n == 0)
        {
            return n;
        }
        else
        {
            while(lastP > n)
            {
                lastP = lastP % n;
            }
            return lastP;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
}
