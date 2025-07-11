package com.vetias.java.workshop.basics.file;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCopyUsingBinary {
    public static void main(String[] args) {
        
     try(FileInputStream inputStream = new FileInputStream("tamil-jug_logo.j");
     FileOutputStream outputStream =new FileOutputStream("output.txt")){
    byte[] chunk = new byte[1098];
    int byteRead;
    while ((byteRead=inputStream.read(chunk))!=-1){
          outputStream.write(chunk,0,byteRead);
    }
        
    }catch (IOException e){                                
 System.out.println("Error is readind or writing the file:");
            
        }
    }
}
