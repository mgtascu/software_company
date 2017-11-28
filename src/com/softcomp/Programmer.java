package com.softcomp;


public class Programmer extends Employee implements Payments{

    public int yearsOfXp;
    public String pLang;

    public Programmer(String name, long ssn, double bankAccount,int yearsOfXp, String pLang){
        super(name,ssn,bankAccount);
        this.yearsOfXp=yearsOfXp;
        this.pLang=pLang;
    }
    @Override
    public void getSalary() {
        bankAccount+=(2000+yearsOfXp*500);
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
