package com.shradhey;


/**
 * Created by Shradhey Tripathi on 12/17/2018
 */
public class ModifiedKaprekar {


    static int calculateDigits(long n) {
        int count = 0;
        while(n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    static void kaprekarNumbers(int p, int q) {
        boolean isAnyNumber = false;
        for(long i = p;i <= q;i++) {
            long square = i*i;
            int l;
            int digitsInSquare = calculateDigits(square);
            int d = digitsInSquare % 2 == 0 ? digitsInSquare/2 : digitsInSquare/2 + 1;
            String number = Long.toString(square);
            int r = Integer.parseInt(number.substring(number.length() - d));
            if(digitsInSquare % 2 == 0) {
                l = Integer.parseInt(number.substring(0, d));
            } else {
                if(d == 1) l = 0;
                else
                    l = Integer.parseInt(number.substring(0, d - 1));
            }

            if(l + r == i) {
                isAnyNumber = true;
                System.out.print(i + " ");
            }
        }
        if(isAnyNumber == false) {
            System.out.print("INVALID RANGE");
        }


    }

    public static void main(String[] args) {

        int p = 1;
        int q = 99999;

        kaprekarNumbers(p, q);


    }
}
