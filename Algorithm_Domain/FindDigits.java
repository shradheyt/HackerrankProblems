package com.shradhey;

import java.util.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int num;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            num = n;
            int count = 0;
            while(n > 0)
            {
                int temp = n % 10;
                n = n / 10;
                if(temp != 0 && num % temp == 0)
                    count++;
            }
            System.out.println(count);
        }
    }
}

