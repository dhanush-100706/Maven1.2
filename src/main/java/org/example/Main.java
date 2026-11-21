package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Subjects marks:");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double d= sc.nextDouble();
        double e= sc.nextDouble();
        double avg=(a+b+c+d+e)/5;
        if(avg>=90)
            System.out.println("Grade A");
        else if(avg<90 && avg>=75)
            System.out.println("Grade B");
        else if(avg<75 && avg>=50)
            System.out.println("Grade c");
        else
            System.out.println("Grade F");
    }
}