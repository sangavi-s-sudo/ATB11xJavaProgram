package ex_23_oops_Abstraction;

import org.w3c.dom.ls.LSOutput;

public class Abstraction_real {
    public static void main(String[] args) {
        sons s1 = new sons();
        s1.computePay();
        s1.mailCheck();

        //Employee f1 = new Employee(); -> this is not possible as this is abstract in nature .n i.e) incomplete claasses cannot hav objet

    }

}

abstract class Employee {    // this is abstarct class -// if we have abstract method , then it shpuld be abstract class
    private int number;
    private String address;
    private String name;

    Employee() {
        System.out.println("Default constructor ");
    }

    Employee(int num, String add, String nam) {
        number = num;
        address = add;
        name = nam;
    }

    abstract void computePay();

    void mailCheck() {
        System.out.println("Normal function");
    }
}

class sons extends Employee {// this is a concrete/ completed class

    @Override
    void computePay() {
        System.out.println("completed by son");
    }

    sons(){
        System.out.println("SOn's constructor");
    }
}