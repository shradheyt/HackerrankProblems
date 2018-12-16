package com.shradhey;

/**
 * Created by Shradhey Tripathi on 12/16/2018
 */

        import java.io.*;
        import java.util.*;


public class BeautifulTriplets {

    // Complete the beautifulTriplets function below.
    static boolean isInArray(int[] arr, int ele) {
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] == ele) return true;
        }
        return false;
    }
    static int beautifulTriplets(int d, int[] arr) {
        int count=0;
        for(int i = 0;i < arr.length;i++) {

            if(isInArray(arr,arr[i] + d) == true) {
                if(isInArray(arr,arr[i] + d + d) == true) {
                    count++;
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
