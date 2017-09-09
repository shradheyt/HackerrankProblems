package com.shradhey;
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class DrawingBookProblem {

    static boolean isEven(int n)
    {
        if(n % 2 == 0)
            return true;
        return false;
    }
    static int solve(int n, int p){
        int last;
        int fromStart;
        int fromLast;
        if(isEven(n))
            last = n;
        else
            last = n - 1;

        if(p <= 1 || p >= last)
            return 0;
        else
        {
            fromStart = isEven(p) ? (p + 1)/2 : (p - 1)/2;
            fromLast = isEven(p) ? (last - p)/2 : (last - p)/2 + 1;

            if(fromStart < fromLast)
                return fromStart;
            else
                return fromLast;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
