package com.company;

public class Main {

    public static void main(String[] args) {
        int h=5;
        int r,c,x,y;

        for(r=0;r<h;r++){
            for(c=0;c<h-r-1;c++){
                System.out.println("*");
            }
            for (x=0;x<r+1;x++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
