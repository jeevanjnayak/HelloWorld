package com.company;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        int year;
        System.out.println("You should enter a year after 1581");
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year >= 1582)
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
                System.out.println(year+" is a leap year");
            else
                System.out.println(year+" is not a leap year");
        else
            System.out.println("Error!! Before 1582 this system doesn't work");
    }
}