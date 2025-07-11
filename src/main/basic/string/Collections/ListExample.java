package com.vetias.java.workshop.basics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("narayani");
        names.add("vishnu");
        names.add("neetu");
        names.add("shiva");
        names.forEach(System.out:: println);
        names.sort(Comparator.reverseOrder());
        System.out.println(names);
        for (int i=0; i<names.size();i++)
        {
            System.out.println((names.get(i)));
        }
    }
    }





