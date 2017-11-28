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
        double salary=2000+(yearsOfXp*500);
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
