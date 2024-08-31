package org.example;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;


public class Dev {

    private Laptop laptop;
    private Computer com;
    private int age;

    public Dev() {
        System.out.println("Dev Constructor");
    }

//    public Dev(int age) {
//        this.age = age;
//        System.out.println("Dev 1 constructor");
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Dev 1 constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build() {

        System.out.println("Working on Awesome Project");
        laptop.compile();
    }
}