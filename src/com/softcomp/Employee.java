package com.softcomp;

public class Employee {


    public String name;
    public long ssn;
    public double bankAccount;


    public Employee(String name, long ssn, double bankAccount){
        this.name=name;
        this.ssn=ssn;

        if(bankAccount >=0.0){
            this.bankAccount = bankAccount;
        }
    }
}
