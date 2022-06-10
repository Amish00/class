package com.techaxis.CoreJava.Main.java.practiceQ.p5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {
        ArrayList<Rating> mylist = new ArrayList<>();
        Set<String> movieidlist = new HashSet<>();
        List<Rating> inbetweenlist = new ArrayList<>();
        String path ="C:\\Users\\nepac\\Downloads\\hadoop.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Date startDate= new Date(1950,1,1);
        Date endDate = new Date(1980,1,1);
        Date timeNow = new Date();
      //  System.out.println("comparision "+ timeNow.after(startDate));

        String line = bufferedReader.readLine();
        int userId;
        int movieId;
        int rating;
        Date timestamp;
        String arr[]=new String[4];
        while(line!=null) {
            arr = line.split("\t");
            userId = Integer.parseInt(arr[0]);
            movieId = Integer.parseInt(arr[1]);
            rating = Integer.parseInt(arr[2]);
            int d = Integer.parseInt(arr[3]);
            timestamp = new Date(d);

            Rating r = new Rating();
            r.userId = userId;
            r.movieId = movieId;
            r.rating = rating;
            r.timestamp = timestamp;
           // System.out.println(r);
            mylist.add(r);
            movieidlist.add(arr[1]);
            line = bufferedReader.readLine();

       }

        System.out.println(movieidlist.size());
        System.out.println(mylist.size());
        // averatge rating ratingsum Map<key ,val
        List<Output>outputsList=new ArrayList<>();
        Output output=new Output();
        Map<Integer,List<Output>> myMap=new HashMap<>();
        for (String  s:movieidlist
             ) {

             for(Rating r: mylist){
                 double avg=0;
                 int count=0;
                 if(s.equals(r.movieId)){
                     avg+=r.rating;
                     count++;
                 }
                 output.avgRating=avg/count;
                 output.numberOfPeople=count;
                outputsList.add(output);
             }
             myMap.put(Integer.valueOf(s),outputsList);
        }
        System.out.println(myMap.size());
int i=0;
        for (Integer name: myMap.keySet())
        {

            System.out.println(i);
            i++;
        }

    }

}
