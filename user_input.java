package com.java_program;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int myNum = 20;
        float myFloatNum = 20.25f;
        char myLetter = 'P';
        boolean myBool = true;
        //String myText = "Unknown";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name");
        String myText = scan.next();
        System.out.println("My name is "+myText);
    }
}
