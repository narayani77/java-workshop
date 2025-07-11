package com.vetias.java.workshop.basics;
import java.util.Scanner;
import java.time.LocalDate;


public class agecalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
       // System.out.println("enter your yearofbirth ");
       // int yearofbirth = inputScanner.nextInt();
        //int currentyear = LocalDate.now().getYear();
        //int age = currentyear-yearofbirth;
       // System.out.println("your age is:"+age);
//comment 
System.out.println("enter your yearofbirth:");
String dataofbirth = inputScanner.nextLine();
LocalDate birthDate = LocalDate.parse(dataofbirth);
int Yearofbirth = birthDate.getYear();
int Currentyear =LocalDate.now().getYear();
    }
}