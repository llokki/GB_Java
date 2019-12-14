package ru.geekbrains.java_one.lesson_d.online.Home_Work;


public class Main {
    public static void main(String[] args){

        Employee x1 = new Employee("Petrov Petr Petrovich", "Emperor of the Mankind", 8883974, 12000, 32);
        Employee x2 = new Employee("Van Hellsing", "painter", 1361355, 333000, 46);
        Employee x3 = new Employee("Gogi Volosatie Nogi", "warrior", 5432452, 125400, 34);
        Employee x4 = new Employee("Ceritelli Givi Zurabovich", "writer", 3451255, 122, 57);
        Employee x5 = new Employee("Agtonom Agronomov", "butcher", 4556266, 4000, 98);

        x1.salaryUp();
        x2.salaryUp();
        x3.salaryUp();
        x4.salaryUp();
        x5.salaryUp();

        x1.old();
        x2.old();
        x3.old();
        x4.old();
        x5.old();

        x1.Id();
        x2.Id();
        x3.Id();
        x4.Id();
        x5.Id();
    }
}
