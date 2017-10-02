package com.shradhey;


import java.util.*;
import java.math.*;


public class LargeFactorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger ans = new BigInteger("1");
        while(n > 1)
        {
            ans = ans.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(ans);
    }
}
