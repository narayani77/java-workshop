package com.vetias.java.workshop.basics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class characterbasedreader {
    public static void main(String[] args) {
        try( BufferedReader Reader = new BufferedReader(new FileReader("E:\\coding\\java-workshop\\com.vetias java workshop basics\\file\\Narayani.txt")))
   {
               String line;
                  while ((line = Reader.readLine())!=null){
                       System.out.println(line);
                }
               }catch (IOException e){
    System.out.println("An error accured while readinf the file:");
    e.printStackTrace();
     
    }
}
}

