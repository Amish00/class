package com.techaxis.CoreJava.Main.java.practiceQ.p4;

public class SimRegistration {
    String MSISDN;
    String SimType;
    String dob;
    String name;
    String address;
    String idNumber;

    public SimRegistration(String MSISDN, String simType, String dob, String name, String address, String idNumber) {
        this.MSISDN = MSISDN;
        SimType = simType;
        this.dob = dob;
        this.name = name;
        this.address = address;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "SimRegistration{" +
                "MSISDN='" + MSISDN + '\'' +
                ", SimType='" + SimType + '\'' +
                ", dob='" + dob + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
