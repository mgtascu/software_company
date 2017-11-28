package com.softcomp;


public class Employee {


    private String getName;
    private long ssn;
    public double bankAccount = 0.0;

    public String getName() {
        return getName;
    }

    public void setName(String name) {
        this.getName = name;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }


    public Employee() {
    }
}
