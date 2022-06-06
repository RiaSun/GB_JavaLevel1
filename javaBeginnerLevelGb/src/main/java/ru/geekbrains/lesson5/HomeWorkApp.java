package ru.geekbrains.lesson5;


public class HomeWorkApp {

    public static void main(String[] args) {
        Personnel staff1 = new Personnel("Petrov Petr", "librarian", "petr@mail.ru", "777-777-777", 50000, 45);
        Personnel staff2 = new Personnel("Ivanova Inna", "main librarian", "inna@mail.ru", "888-888-888", 60000, 30);
        Personnel staff3 = new Personnel("Svetlova Sveta", "editor", "sveta@mail.ru", "999-999-999", 63000, 27);
        Personnel staff4 = new Personnel("Michailov Michail", "security", "michail@mail.ru", "333-333-333", 43000, 52);
        Personnel staff5 = new Personnel("Morskaya Marina", "author", "marina@mail.ru", "444-444-444", 65000, 35);

        Personnel[] staff = {staff1, staff2, staff3, staff4, staff5};

        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getAge() > 40) {
                staff[i].print();
            }
        }
// вывести все элементы цикла в консоль
 //        for (int i = 0; i < staff.length; i++) {
//            staff[i].print();
//        }


    }


}