package com.techaxis.CoreJava.Main.java.File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\nepac\\OneDrive\\Documents\\Corejava\\javacore\\hello.txt";
        File file= new File(path);
       /* System.out.println(file.getPath());
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exist!");
            }
        } catch(Exception e ){
            System.out.println("Error occurred!!" + e.getMessage());
        }*/

        /*FileWriter writer = null;
        try{
           writer = new FileWriter("C:\\Users\\nepac\\OneDrive\\Documents\\Corejava\\javacore\\hello.txt");
        writer.write("hello from source code!!");
writer.append( " \nerror");}
        catch(Exception e){
            System.out.println("Error occurred!!" + e.getMessage());
        }
finally{
    writer.close();
        }*/
        FileReader fileReader=null;
        try{
            fileReader =new FileReader(path);
            int i=fileReader.read();
            while(i!=-1){
                System.out.print((char)i);
                i=fileReader.read();
            }
        } catch (Exception e){
            System.out.println("Error occurred!!" + e.getMessage());
        }


    }
}
