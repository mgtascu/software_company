package com.softcomp;

public class Main {

    public static void main(String[] args) {


        Secretary e1 = new Secretary();
        Programmer p1 = new Programmer();
        SysIng s1 = new SysIng();

        e1.setName("Doina");
        e1.setSsn(1837918121);
        e1.setLang("Spanish");

        p1.setName("Hortentiu");
        p1.setSsn(1920501543);
        p1.setpLang("JavaScript");
        p1.setYearsOfXp(5);

        s1.setName("Cameliu");
        s1.setSsn(1881129092);
        s1.setSpec("Control Engineering");

        e1.getSalary();
        p1.getSalary();
        s1.getSalary();

        e1.spend(300);
        p1.addRAM();
        s1.changeHDD();

        s1.spend(1500);
        s1.spend(400);
        s1.addRAM();
        s1.spend(400);

        p1.changeHDD();
        p1.spend(3000);
        p1.spend(2000);

    }
}
