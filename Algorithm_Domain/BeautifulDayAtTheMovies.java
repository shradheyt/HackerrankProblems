package com.shradhey;


import java.util.*;

public class BeautifulDayAtTheMovies {
    static int reverse(int num)
    {
        int temp,n,rev = 0;
        n = num;
        while(n > 0)
        {
            temp = n % 10;
            n = n / 10;
            rev = (rev * 10) + temp;
        }
        return rev;
    }

    public static void main(String[] args) {
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        j = sc.nextInt();
        k = sc.nextInt();
        int count =0;
        for(int x = i;x <= j;x++)
        {
            int rev = reverse(x);
            if((Math.abs(rev - x) % k) == 0)
                count++;
        }
        System.out.println(count);

    }
}