package com.vetias.java.workshop.Stream;

public class EvenOddSplitExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Split the array into even and odd numbers
        int[] evenNumbers = new int[numbers.length];
        int[] oddNumbers = new int[numbers.length];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenIndex++] = number;
            } else {
                oddNumbers[oddIndex++] = number;
            }
        }

        // Print the even numbers
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Print the odd numbers
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

    }

}

    


