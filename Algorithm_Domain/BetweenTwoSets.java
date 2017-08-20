package com.shradhey;
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;


public class BetweenTwoSets {
    public static int gcd ( int x , int y )
    {
        if ( y == 0 )
            return x;
        else if ( x >= y && y > 0)
            return gcd ( y , x % y );
        else return gcd ( y , x );        // if x < y then go ahead and switch them around.
    }
    static int findlcm(int arr[], int n)
    {
        // Initialize result
        int ans = arr[0];

        // ans contains LCM of arr[0],..arr[i]
        // after i'th iteration,
        for (int i=1; i<n; i++)
            ans = ( ((arr[i]*ans)) /
                    (gcd(arr[i], ans)) );

        return ans;
    }

    static int getTotalX(int[] a, int[] b,int min,int max) {
        if(min < max)
            return 0;
        int gcdValue = findlcm(a,a.length);
        List<Integer> al = new ArrayList<>();

            for(int j = max;j <= min;j++)
            {

                if(j % gcdValue == 0)
                {
                    al.add(j);
                }

        }
        int count = 0;
        int countA =0;

            for(int j = 0;j < al.size() ;j++)
            {
                for(int i = 0;i < b.length;i++)
                {
                    if (b[i] % al.get(j) == 0)
                        countA++;
                    if(countA == b.length)
                        count++;
                }
                countA=0;
            }


        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if(max < a[a_i])
                max = a[a_i];
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
            if (min > b[b_i])
                min = b[b_i];
        }
        int total = getTotalX(a, b,min,max);
        System.out.println(total);
        in.close();
    }
}
