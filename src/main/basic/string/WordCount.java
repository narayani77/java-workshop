package com.vetias.java.workshop.basics;
public class WordCount {
    public int count(String inpuString){
        int count=0;
        String[] word=inpuString.split("");
        count = word.length;
        return count;
    }


}
