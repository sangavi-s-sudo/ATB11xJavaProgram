package ex_31_oops_Collection_Framework.List;

import java.util.Stack;

public class ex_13_Stack {
    public static void main(String[] args) {
        // stack -> Last in first out  (Eg: Record notes submitted for correction )
//        Stack s = new Stack();
//        s.add("Sangavi");
//        s.add("Naveen");
//        System.out.println(s);


        // in stack we have many functions =>Push
        Stack s = new Stack();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit");
        s.push("Amit2");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println("++++++++");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(")))))))))))))");

        System.out.println(s);


        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);
    }
}
