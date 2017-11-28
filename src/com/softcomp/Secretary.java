package com.softcomp;


public class Secretary extends Employee implements Payments{

    public String lang;

    public Secretary(String name, long ssn, double bankAccount,String lang){
        super(name, ssn,bankAccount);
        this.lang=lang;
    }

    @Override
    public void getSalary() {
        double salary=1000;
        bankAccount+=salary;
        System.out.println(name+ " got paid "+ salary);
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
