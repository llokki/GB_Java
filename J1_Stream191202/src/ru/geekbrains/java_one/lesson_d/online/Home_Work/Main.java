package ru.geekbrains.java_one.lesson_d.online.Home_Work;

public class Main {

    static Employee[] array = new Employee[5];

    public static void main(String[] args){

        array[0] = new Employee("Petrov Petr Petrovich", "Emperor of the Mankind", 8883974, 12000, 32);
        array[1] = new Employee("Van Hellsing", "painter", 1361355, 333000, 46);
        array[2] = new Employee("Gogi Volosatie Nogi", "warrior", 5432452, 125400, 34);
        array[3] = new Employee("Ceritelli Givi Zurabovich", "writer", 3451255, 122, 57);
        array[4] = new Employee("Agronom Agronomov", "butcher", 4556266, 4000, 98);



//        Employee x1 = new Employee("Petrov Petr Petrovich", "Emperor of the Mankind", 8883974, 12000, 32);
//        Employee x2 = new Employee("Van Hellsing", "painter", 1361355, 333000, 46);
//        Employee x3 = new Employee("Gogi Volosatie Nogi", "warrior", 5432452, 125400, 34);
//        Employee x4 = new Employee("Ceritelli Givi Zurabovich", "writer", 3451255, 122, 57);
//        Employee x5 = new Employee("Agronom Agronomov", "butcher", 4556266, 4000, 98);

        array[0].salaryUp();
        array[1].salaryUp();
        array[2].salaryUp();
        array[3].salaryUp();
        array[4].salaryUp();

        array[0].old();
        array[1].old();
        array[2].old();
        array[3].old();
        array[4].old();
    }
}
