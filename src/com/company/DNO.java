package com.company;

import java.util.Scanner;

public class DNO {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if (a<=9 && a>=0)
            System.out.println("DIGIT");
        if (a>=10 && a<100)
            System.out.println("NUM");
        else
            System.out.println("OTHER");
    }
}
