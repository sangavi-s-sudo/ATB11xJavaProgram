package ex_14_OOPs_single_inheritance;

public class Real_Single_inheritance {
    public static void main(String[] args) {
        Testcases1 s1 = new Testcases1();
        s1.eat();

        System.out.println("_____________________");
        Testcases2 s2 = new Testcases2();
        s2.sleep();


        Son s3 = new Son();
        System.out.println(s3.bike);
        System.out.println(s3.gold_father);

    }
}
