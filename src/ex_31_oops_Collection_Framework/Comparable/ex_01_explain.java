package ex_31_oops_Collection_Framework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex_01_explain {
    public static void main(String[] args) {
        Student s1 = new Student(1,"San",25);
        Student s2  = new Student(104,"Jai",21);
        Student s3  = new Student(106,"Ajay",27);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        // Collections.sort(studentList); --> not possible becoz not given way to compare  each element with other objects
        // for doing do we have to it with comparable interfaces

        // but we can sort below one as it supports natural ordering
//        List marks = new ArrayList();
//        marks.add(91);
//        marks.add(95);
//        marks.add(93);
//        marks.add(87);
//        marks.add(41);

//        Collections.sort(marks);
        Collections.sort(studentList);
        System.out.println(studentList);
    }
}

class Student implements  Comparable <Student>{

    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;


    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "Student{name= "+ name + ", " + "rollNo= "+ rollNo + ", "+ "age= " + age  ;
    }


//    @Override
//    public int compareTo(Student o) {
//        return this.age-o.age;
//    }
//

//    @Override
//    public int compareTo(Student o) {
//        return this.rollNo-o.rollNo;
//    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    // By using comparable interface  here we can compare using only one variable
}
