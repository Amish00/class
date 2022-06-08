package com.techaxis.CoreJava.Main.java.collections.mapset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class list {
        /*public static void main(String args[]){
            ArrayList<String> list=new ArrayList<String>();//Creating arraylist
            list.add("Ravi");//Adding object in arraylist
            list.add("Vijay");
            list.add("Ravi");
            list.add("Ajay");
//Traversing list through Iterator
            Iterator itr=list.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }*/

    /*public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }*/

    public static void main(String args[]){
        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }






















    }


