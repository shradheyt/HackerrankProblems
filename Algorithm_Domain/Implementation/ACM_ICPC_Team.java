package com.shradhey;

import java.util.*;


public class ACM_ICPC_Team {
    public static int countBits(long n)
    {
        int count = 0;
        while(n > 0)
        {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int max = -1;;
        int count = 0;
        String topic[] = new String[n];
        String temp;
        StringBuilder str;
        for(int topic_i=0; topic_i < n; topic_i++){

            topic[topic_i] = in.next();
        }
        long number;
        int bits;
        int topics = 0;

        for(int i = 0;i < n - 1;i++)
        {
            for(int j = i + 1;j < n;j++)
            {
                topics = 0;
                for(int x = 0;x < m;x++)
                {
                    if(topic[i].charAt(x) == '1' || topic[j].charAt(x) == '1')
                        topics++;
                }
                if(topics > max)
                {
                    max = topics;
                    count = 1;
                }
                else if(topics == max)
                    count++;



            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}

