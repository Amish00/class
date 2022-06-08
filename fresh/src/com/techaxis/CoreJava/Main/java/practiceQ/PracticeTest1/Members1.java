package com.techaxis.CoreJava.Main.java.practiceQ.PracticeTest1;

public class Members1 {
    int id;
    String firstname;
    String lastname;
    String address;
    String city;
    String state;
    String zip;

    public Members1() {}

    public Members1(int id, String lastname, String firstname,  String address, String city, String state, String zip) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Members1{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
     public  String toCSVString(){
        return  id+","+firstname+","+lastname+","+address+","+city+","+zip+"\n";
     }
}
