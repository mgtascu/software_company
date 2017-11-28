package com.softcomp;

public class SysIng extends Employee implements Payments {

    public String spec;

    public SysIng(String name, long ssn, double bankAccount, String spec){
        super(name,ssn, bankAccount);
        this.spec=spec;
    }

    @Override
    public void getSalary() {
        bankAccount+=1500;
    }
    @Override
    public void getPaid(int payment) {
        bankAccount+=payment;
    }

    @Override
    public void spend(double ammountSpent) {
        bankAccount-=ammountSpent;
    }
}
