package com.techaxis.CoreJava.Main.java.practiceQ.p4;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\nepac\\OneDrive\\Desktop\\File\\registration.txt";
        //  String path1 = "C:\\Users\\nepac\\Downloads\\sim-registration1.csv";
        ArrayList<SimRegistration> list = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fileReader);

        // File file1 =new File(path1);
        // FileWriter fileWriter= new FileWriter(file1);
        // BufferedWriter bWriter = new BufferedWriter(fileWriter);

        String line = null;
        line = bReader.readLine();

        System.out.println(line);
        String MSISDN = null;
        String SimType;
        String dob;
        String name;
        String address;
        String idNumber;
while(line!=null){
        MSISDN = line.substring(0, 10).trim();
        SimType = line.substring(11, 23).trim();
        dob = line.substring(24, 50).trim();
        name = line.substring(51, 79).trim();
        address = line.substring(80, 117).trim();
        idNumber = line.substring(118).trim();

//        System.out.println(MSISDN);
//        System.out.println(SimType);
//        System.out.println(dob);
//        System.out.println(name);
//        System.out.println(address);
//        System.out.println(idNumber);

        SimRegistration registration = new SimRegistration(MSISDN, SimType, dob, name, address, idNumber);
        System.out.println(registration);
        list.add(registration);

        line=bReader.readLine();
    }

bReader.close();
fileReader.close();

ArrayList<SimRegistration>list1=getNonEmpltyRegistration(list);
        System.out.println("Length of new List with no empty field= "+ list1.size());
        
       ArrayList<SimRegistration>list2=getValidAddress(list1);
        System.out.println("Length of new list after checking addresses= "+list2.size());
           
        
    }

    private static ArrayList<SimRegistration> getValidAddress(ArrayList<SimRegistration> list1) {
        ArrayList<SimRegistration>list3=new ArrayList<>();
        for (SimRegistration sr:list1
             ) {
            if(sr.address.length()>=20){
                list3.add(sr);
            }
        }
        return list3;
    }


    private static ArrayList<SimRegistration> getNonEmpltyRegistration(ArrayList<SimRegistration> list) {
        ArrayList<SimRegistration>list2=new ArrayList<>();
        for (SimRegistration sr:list
             ) {
            if(sr.address!=""&&sr.MSISDN!=""&&sr.dob!=""&&sr.name!=""&&sr.idNumber!=""&&sr.SimType!=""){
                list2.add(sr);
            }
        }
        return list2;
    }

}
