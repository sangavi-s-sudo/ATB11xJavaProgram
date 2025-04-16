package ex_13_OOPs_constructor;

import org.w3c.dom.ls.LSOutput;

public class Q1_Constructor_overloading_05 {
    public static void main(String[] args) {
        ATB1 a1 = new ATB1 ("SAN",2345678l,12);
        a1.eat();
        System.out.println(a1.age);


        ATB1 b1 = new ATB1(23456789l, 34);
        System.out.println(b1.phone);
    }
}


class ATB1{
    String name ;
    long phone;
    int age;


    ATB1(){
        System.out.println("DC");
    }

    ATB1(String name_args , long phone_args , int age_args ){
        name = name_args;
        phone=  phone_args;
        age = age_args;
    }

    ATB1(long phone_args1 , int age_args1 ){
        phone=  phone_args1;
        age = age_args1;
    }

    void eat(){
        System.out.println(this.name + " is eating!");
    }
}