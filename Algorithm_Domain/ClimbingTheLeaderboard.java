package com.shradhey;

import java.util.*;


public class ClimbingTheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        Stack<Integer> stack = new Stack<Integer>();
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
            if(stack.empty() || scores[scores_i] != stack.peek())
            {
                stack.push(scores[scores_i]);
            }

        }
        int m = in.nextInt();
        int[] alice = new int[m];
        int stackSize = stack.size();
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        for(int alice_i=0; alice_i < m; alice_i++){
            while(!stack.empty() && alice[alice_i] >= stack.peek())
            {
                stack.pop();
            }
            System.out.println(stack.size() + 1);
        }

    }
}
