package com.shradhey;


import java.util.*;


public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long length = s.length();
        long count = 0;

        long multi  = n / length;
        long extra  = n % length;
        if(length == 1)
        {
            if(s.charAt(0) == 'a')
                System.out.println(n);
            else
                System.out.println(0);
        }
        else
        {
            for(int i = 0;i < length;i++)
            {
                char c = s.charAt(i);
                if(c == 'a')
                    count++;

            }
            count = count * multi;
            for(int i = 0;i < extra;i++)
            {
                char c = s.charAt(i);
                if(c == 'a')
                    count++;
            }
            System.out.println(count);
        }
    }
}
