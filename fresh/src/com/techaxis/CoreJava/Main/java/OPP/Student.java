package com.techaxis.CoreJava.Main.java.OPP;

public class Student {
    private int id;
    private String name;
    private String address;


   /* public void Setdata(int id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }*/


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display(){
        System.out.println("Name: "+ name +"\nId: "+id+"\nAddress: "+address+"\n");
    }

/*   public static void main(String[] args) {
      int readId;
        String  readName,readAddress;
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Scanner read=new Scanner(System.in);
        System.out.println("Enter id of object 1");
        readId=read.nextInt();
        s1.setId(readId);
        System.out.println("Enter name of object 1");
        readName=read.next();
        s1.setName(readName);
        System.out.println("Enter address of object 1");
        readAddress=read.next();
        s1.setAddress(readAddress);
        s1.display();
     //   System.out.println("the address is "+ s1.getAddress());
        s2.setId(45);
        s2.setName("Ram");
        s2.setAddress("KTM");
        s2.display();

    }*/
}


