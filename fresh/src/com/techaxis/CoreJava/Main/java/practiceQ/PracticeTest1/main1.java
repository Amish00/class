package com.techaxis.CoreJava.Main.java.practiceQ.PracticeTest1;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class main1 {
    public static void main(String[] args) throws IOException {
        ArrayList<Members1> listOfMembers=new ArrayList<>();
        Set<Integer> idSet= new HashSet<>();
        Set<Members1> setOfMembers = new HashSet<>();
        Set<String> stateSet = new HashSet<>();
        String path = "C:\\Users\\nepac\\Downloads\\Practice_Test1\\Practice_Test1\\Members.txt";

        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fileReader);

        String line = null;
        line = bReader.readLine();

        int id ;
        String lastname;
        String firstname;
        String address;
        String city;
        String state;
        String zip;

        for(int i = 0; line != null; i++){
            id= Integer.parseInt(line.substring(0,11).trim());
            lastname=line.substring(12,36).trim();
            firstname=line.substring(37,61).trim();
            address=line.substring(62,91).trim();
            city=line.substring(92,111).trim();
            state=line.substring(112,115).trim();
            zip= line.substring(116).trim();

            Members1 members1 = new Members1(id,lastname,firstname,address,city,state,zip);
            listOfMembers.add(members1);
            stateSet.add(members1.state.toString());
            idSet.add(members1.id);
            line= bReader.readLine();

        }
        System.out.println("No. of ID = "+idSet.size());

        for (Members1 m:listOfMembers) {
            if(idSet.contains(m.id)){
                setOfMembers.add(m);
                idSet.remove(m.id);
            }
        }
        System.out.println(setOfMembers.size());

        splitByState(setOfMembers,stateSet);
        bReader.close();
        fileReader.close();
    }

    private static void splitByState(Set<Members1> setOfMembers, Set<String> stateSet) throws  IOException{
        for (String s:stateSet) {
            String path = "C:\\Users\\nepac\\Downloads\\Practice_Test1\\Practice_Test1\\"+s+"_outputFile.csv";
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Members1 m:setOfMembers) {
                if(s.equals(m.state)){
                    System.out.println(m);
                    bufferedWriter.write(m.toCSVString());
                }
            }
            bufferedWriter.close();
            fileWriter.close();

        }
    }
}
