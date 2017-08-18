package com.shradhey;

import java.util.*;

public class BreakingBestAndWorstRecords {

    static int[] getRecord(int[] s){
        int least = 0;
        int most = 0;
        long initial = s[0];
        long highest = initial;
        long lowest = initial;
        int[] result = new int[2];

        for(int i = 1;i < s.length;i++)
        {
            if(s[i] > highest)
            {
                highest = s[i];
                most++;
            }
            if(s[i] < lowest)
            {
                lowest = s[i];
                least++;
            }
        }

        result[0] = most;
        result[1] = least;
        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
