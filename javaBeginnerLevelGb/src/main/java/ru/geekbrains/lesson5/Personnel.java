package ru.geekbrains.lesson5;

public class Personnel {

    private String fullName;
    private String duty;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Personnel(String fullName, String duty, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.duty = duty;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("[" + fullName + ", " + duty + ", " + email + ", " + phone + ", " + salary + ", " + age + "]");
    }

    public int getAge(){
        return age;
    }





}


