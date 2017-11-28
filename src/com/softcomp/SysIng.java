package com.softcomp;

public class SysIng extends Employee implements Payments, AdditionalJobs {

    private String spec;

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public SysIng() {
        super();
    }

    @Override
    public void getSalary() {
        double salary = 1500;
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
        double jobPayment = 200;
        bankAccount += jobPayment;
        System.out.println(getName() + " earned an additional " + jobPayment + " RON, for installing a new RAM chip");
    }

    @Override
    public void changeHDD() {
        double jobPayment = 300;
        bankAccount += jobPayment;
        System.out.println(getName() + " earned an additional " + jobPayment + " RON, for changing a Hard Drive");
    }
}
