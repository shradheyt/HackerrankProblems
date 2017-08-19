
package com.shradhey;
import java.util.*;


public class TheBirthdayBar  {

    static int solve(int n, int[] s, int d, int m){
        int sum = 0;
        int count = 0;
        for(int i = 0;i < (n - m + 1);i++)
        {
            for(int j = i;j < (m + i);j++)
            {
                sum = sum + s[j];
            }
            if(sum == d)
            {
                count++;

            }
            sum = 0;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
