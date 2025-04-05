package Tasks.Task_18_Encapsulation;

import org.w3c.dom.ls.LSOutput;

public class Qn2 {
    public static void main(String[] args) {
//        ATBStudents a1 = new ATBStudents("John Doe", 19, "Data Science");
//        System.out.println(a1);
        ATBStudents[] a2 = new ATBStudents[3];
        a2[0]= new ATBStudents("abc", 12, "bcf");
        a2[1] = new ATBStudents("abcd", 15, "bcffr");
        a2[2] = new ATBStudents("abcde", 19, "bcggjf");


        for (ATBStudents student  : a2 ){
            System.out.println(student);
        }
    }
}

class ATBStudents{
    String name;
    int age;
    String course;


    ATBStudents(String name1, int age1, String course1){
        name = name1;
        age = age1;
        course = course1;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Course: " + course;
    }
}
