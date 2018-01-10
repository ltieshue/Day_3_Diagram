package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Welcome, enter a number:");

        Scanner sc = new Scanner(System.in);
        String inputFromUser;
        inputFromUser = sc.nextLine();


        int convertedNumber = Integer.parseInt(inputFromUser);

        System.out.println("Your Number:" + convertedNumber);
        convertedNumber = convertedNumber + 5;
        System.out.println("Total: " + convertedNumber);
