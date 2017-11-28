package com.softcomp;


import java.util.ArrayList;

public class Secretary extends Employee implements Payments {

    private String lang;
    private ArrayList<String> langList = new ArrayList<>();

    public ArrayList<String> getLang() {
        return langList;
    }

    public void setLang(String lang) {
        this.lang = lang;
        langList.add(lang);
    }


    public Secretary() {
        super();
    }

    @Override
    public void getSalary() {
        double salary = 1000;
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
}
