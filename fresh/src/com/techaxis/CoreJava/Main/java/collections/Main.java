package com.techaxis.CoreJava.Main.java.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Person> listofperson=new ArrayList<>();
        String path1 = "C:\\Users\\nepac\\OneDrive\\Documents\\Corejava\\fresh\\src\\com\\techaxis\\CoreJava\\Main\\java\\ExceptionHandling\\sampleData.csv";
        File file = new File(path1);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedreader = new BufferedReader(fileReader);

        String line = null;
        line = bufferedreader.readLine();
        System.out.println(line);
        int count = 0;
        while (line != null) {
            int id;
            String sid;
            String name;
            String address;
            String phoneNumber;
            String occupation;
            String array[] = new String[5];
            array = line.split(",");
            sid = array[0];
            id = Integer.parseInt(sid);
            name = array[1];
            address = array[2];
            phoneNumber = array[3];
            occupation = array[4];

           Person person = new Person(id, name, address, phoneNumber, occupation);
            listofperson.add(person);
            line = bufferedreader.readLine();

        }
        System.out.println(listofperson.size());
        for(Person p:listofperson){
            if (p.occupation.equals("Teacher")) {
                count += 1;
                System.out.println(p);
            }
        }



        System.out.println("the number is teachers are " +count);
        bufferedreader.close();
        fileReader.close();


    }
}
