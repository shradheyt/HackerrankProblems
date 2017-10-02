package com.shradhey;

import java.util.*;

public class StrangeAdvertising {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int sum = 0;
        int people = 0;
        int m = 5;
        for(int i = 0;i < n;i++)
        {
            people = (m / 2) ;
            sum = sum + people;
            m = people * 3;
        }
        System.out.println(sum);
    }
}