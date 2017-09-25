package com.shradhey;


import java.util.*;


public class TaumAndBDay {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long ans = 0;
            if(z >= Math.abs(x - y))
                ans = (b * x) + (w * y);
            else if(x >= y )
                ans = (b * (y + z)) + (w * y);
            else
                ans = (w * (x + z)) + (b * x);

            System.out.println(ans);
        }
    }
}
