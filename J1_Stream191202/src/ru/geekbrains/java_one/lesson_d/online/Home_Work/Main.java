package ru.geekbrains.java_one.lesson_d.online.Home_Work;


public class Main {
    public static void main(String[] args){

        Employee x1 = new Employee("Petrov Petr Petrovich", "Emperor of the Mankind", 8883974, 12000, 32);
        Employee x2 = new Employee("Van Hellsing", "painter", 1361355, 333000, 46);
        Employee x3 = new Employee("Gogi Volosatie Nogi", "warrior", 5432452, 125400, 34);
        Employee x4 = new Employee("Ceritelli Givi Zurabovich", "writer", 3451255, 122, 57);
        Employee x5 = new Employee("Agtonom Agronomov", "butcher", 4556266, 4000, 98);

        Employee.salaryUp();

    }
}
