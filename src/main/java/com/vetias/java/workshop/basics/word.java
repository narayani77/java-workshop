package com.vetias.java.workshop.basics;
public class word {

    public static void main(String[] args){
        String sentence ="this program shows how to splite. a string we need to find the sentence";
        String[] sentences =sentence.split("\\.");
        int  count=sentences.length;
        String[] words =sentence.split("");
        int wordcount = words.length;
        String[] letter = sentence.split(" ");
        int lettercount = letter.length ;
        System.out.println("no.of letters:"+letter);
    }

}
