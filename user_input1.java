package com.java_program;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int myNum = 20;
        //float myFloatNum = 20.25f;
        //char myLetter = 'P';
        //boolean myBool = true;
        //String myText = "Unknown";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name");
        String myText = scan.nextLine();
        System.out.println("My name is "+myText);

        System.out.println("Enter Integer");
        int myNum = scan.nextInt();
        System.out.println("My Integer is "+myNum);

        System.out.println("Enter Floating number");
        float myFloatNum = scan.nextFloat();
        System.out.println("My float value is "+myFloatNum);

        System.out.println("Enter Character");
        char myLetter = scan.next().charAt(0);
        System.out.println("My character value is "+myLetter);

        scan.close();
    }
}
