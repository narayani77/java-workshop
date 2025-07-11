package com.vetias.java.workshop.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {
    

    public static void main(String[] args) {
        int[] marks = {80,70,40,50,30,};
        long numberofSubjectsPassed = Arrays.stream(marks)
        .filter(mark-> mark >= 40).count();
        System.out.println(numberofSubjectsPassed);
        IntStream markStream = Arrays.stream(marks);
        numberofSubjectsPassed = markStream
        .filter(mark-> mark>=40). count();
        System.out.println("number of subjects passed:" +numberofSubjectsPassed);

    }

}
