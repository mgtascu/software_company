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
        System.out.println(name + " earned the monthly salary of " + salary +" RON");
    }

    @Override
    public void getPaid(int payment) {
        bankAccount+=payment;
    }

    @Override
    public void spend(double ammountSpent) {

        if(bankAccount>ammountSpent){
            bankAccount-=ammountSpent;
            System.out.println(name + " spent " + ammountSpent + " RON");
            }
        else
            System.out.println(name+ " tries to spend " + ammountSpent + " RON, but unfortunately has only " + bankAccount +" RON");
    }
}
