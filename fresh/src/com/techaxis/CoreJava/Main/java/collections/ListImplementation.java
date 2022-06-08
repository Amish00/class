package com.techaxis.CoreJava.Main.java.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListImplementation{
    public static void main(String[] args) throws IOException {
        Set<Person> list =new HashSet<>();
        ArrayList<Person> arrlist = new ArrayList<>();
        String path = "C:\\Users\\nepac\\OneDrive\\Documents\\Corejava\\fresh\\src\\com\\techaxis\\CoreJava\\Main\\java\\ExceptionHandling\\sampleData.csv";

        File file = new File(path);
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader);

        int id;
        String sid;
        String name;
        String address;
        String phoneNumber;
        String occupation;

        String line = bufferedReader.readLine();
        while(line!=null){
            String arr[]=new String[5];
            arr=line.split(",");

            sid = arr[0];
            try {
                id = Integer.parseInt(sid);
            }catch (Exception e){
                id=0;
            }
            name = arr[1];
            address = arr[2];
            phoneNumber = arr[3];
            occupation = arr[4];

            Person person = new Person(id,name,address,phoneNumber,occupation);
            list.add(person);
            line = bufferedReader.readLine();

        }
        for (Person p: arrlist) {
            list.add(p);
        }
        System.out.println("The size in set "+list.size());

        bufferedReader.close();
        fileReader.close();
        System.out.println("Enter name of city to show record");
        String city= new Scanner(System.in).next();
        getPersonByCity(list,city);
    }
    private  static void getPersonByCity(Set<Person> list, String city) {


        for (Person p:list) {
            if(p.address.equals(city)){
                System.out.println(p);
            }
        }
    }
}
