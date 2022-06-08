package com.techaxis.CoreJava.Main.java.ExceptionHandling;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      /*int a=0,b=0;
        int arr[]={1,2,3,4,5};
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println(arr[4]);
        }
        catch (Exception e){
            System.out.println("Error Occured "+e.getMessage());
        }
        finally {
            System.out.println("This wii execute anyone");}*/

        String path = "C:\\Users\\nepac\\OneDrive\\Documents\\Corejava\\fresh\\src\\com\\techaxis\\CoreJava\\Main\\java\\ExceptionHandling\\sampleData.txt";
        String path1 = "C:\\Users\\nepac\\OneDrive\\Documents\\Corejava\\fresh\\src\\com\\techaxis\\CoreJava\\Main\\java\\ExceptionHandling\\sampleData.csv";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fileReader);

        File file1 =new File(path1);
        FileWriter fileWriter= new FileWriter(file1);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);

        String line = null;
            line = bReader.readLine();

        line = bReader.readLine();
        System.out.println(line);
        int id;
        String sid;
        String name;
        String address;
        String phoneNum;
        String occupation;

for  (int j=0;line!=null;j++){
        sid = line.substring(0, 3).trim();
        id = Integer.parseInt(sid);
        name = line.substring(4, 33).trim();
        address = line.substring(34, 53).trim();
        phoneNum = line.substring(54, 73).trim();
        occupation = line.substring(74).trim();
        Person person = new Person(id, name, address, phoneNum, occupation);
     //   System.out.println(person);
    line = bReader.readLine();
    System.out.println(line);

    String csvString=sid+","+name+","+address+","+phoneNum+","+occupation+"\n";
    bWriter.write(csvString);
    }
    bWriter.close();
    fileWriter.close();
        bReader.close();
        fileReader.close();


    }
}
