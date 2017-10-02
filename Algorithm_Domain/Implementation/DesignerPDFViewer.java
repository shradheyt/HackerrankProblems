package com.shradhey;


import java.io.*;
import java.util.*;

public class DesignerPDFViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int sizeOfWord = word.length();
        int width = 1;
        int height = 0;
        int index;

        for(int i = 0;i < sizeOfWord;i++)
        {
            index = (25 - ('z' - word.charAt(i)));
            if(height < h[index])
                height = h[index];
        }
        int area = sizeOfWord * height * width;
        System.out.println(area);

    }
}
