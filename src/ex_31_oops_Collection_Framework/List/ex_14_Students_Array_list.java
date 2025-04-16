package ex_31_oops_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ex_14_Students_Array_list {
    public static void main(String[] args) {
        Student s1 = new Student("Naveen", "123");
        Student s2 = new Student("Ritwik","2");
        Student s3 = new Student("Shubham","3");

        List<Student> myStudents = new ArrayList();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);


        System.out.println(myStudents);  // it will print the object references only if override is not used.

        s1.getDetails();
        s2.getDetails();
        s3.getDetails();

        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());

    }
}
