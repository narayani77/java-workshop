package array;

import java.util.Arrays;

public class Employee {
    public static void main(String[]args){
       String[][] employee = new String [6][2];
       employee[0] [0] = "1";
       employee[0] [1] = "sita";
       employee[1] [0] = "2";
       employee[1] [1] = "suresh";
       employee[2] [0] = "3";
       employee[2] [1] = "raman";
       for(String[] employees : employee){
        System.out.println(Arrays.toString(employees));
       }
    }

}
    