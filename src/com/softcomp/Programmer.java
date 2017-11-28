package com.softcomp;


import java.util.ArrayList;

public class Programmer extends Employee implements Payments, AdditionalJobs {


    private int yearsOfXp;
    private String pLang;
    private ArrayList<String> pLangList = new ArrayList<>();

    public int getYearsOfXp() {
        return yearsOfXp;
    }

    public void setYearsOfXp(int yearsOfXp) {
        this.yearsOfXp = yearsOfXp;
    }

    public ArrayList<String> getpLang() {
        return pLangList;
    }

    public void setpLang(String pLang) {
        this.pLang = pLang;
        pLangList.add(pLang);
    }


    public Programmer() {
        super();
    }

    @Override
    public void getSalary() {
        double salary = 2000 + (getYearsOfXp() * 500);
        bankAccount += salary;
        System.out.println(getName() + " earned the monthly salary of " + salary + " RON");
    }

    @Override
    public void spend(double amountSpent) {

        if (bankAccount > amountSpent) {
            bankAccount -= amountSpent;
            System.out.println(getName() + " spent " + amountSpent + " RON");
        } else
            System.out.println(getName() + " tries to spend " + amountSpent + " RON, but unfortunately has only " + bankAccount + " RON");
    }

    @Override
    public void addRAM() {
        double jobPayment = 100;
        bankAccount += jobPayment;
        System.out.println(getName() + " earned an additional " + jobPayment + " RON, for installing a new RAM chip");
    }

    @Override
    public void changeHDD() {
        double jobPayment = 200;
        bankAccount += jobPayment;
        System.out.println(getName() + " earned an additional " + jobPayment + " RON, for changing a Hard Drive");
    }
}
