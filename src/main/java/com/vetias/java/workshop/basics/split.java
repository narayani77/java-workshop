package com.vetias.java.workshop.basics;
public class split {
    public static void main(String[] args) {
         
      String sentence = "Java is a powerfull programing language";
      String words[] = sentence.split("");
      System.out.println("words in the sentence:");
      for(String word : words) {

        System.out.println(word); 
      }
        
        
    }

}
