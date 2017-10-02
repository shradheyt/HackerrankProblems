package com.shradhey;

import java.util.*;

public class CatAndMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int distX,distY;
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            distX = Math.abs(z - x);
            distY = Math.abs(z - y);

            if(distX < distY)
            {
                System.out.println("Cat A");
            }
            else if(distX > distY)
            {
                System.out.println("Cat B");
            }
            else
            {
                System.out.println("Mouse C");
            }
        }
    }
}
