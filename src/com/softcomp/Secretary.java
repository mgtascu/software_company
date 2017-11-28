package com.softcomp;




public class Secretary extends Employee implements Payments {

    private String lang;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
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
