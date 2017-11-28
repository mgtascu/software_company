package com.softcomp;

public class Main {

    public static void main(String[] args) {


        Secretary e1 = new Secretary("Dorina",294070320, 0.0,"Spaniola");
        e1.getSalary();
        e1.getSalary();
        e1.spend(2500);
        System.out.print(e1.bankAccount);
    }
}
