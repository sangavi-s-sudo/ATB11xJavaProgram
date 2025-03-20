package ex_02_java;

public class Inc_dec_operator {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a);
        System.out.println(a);

        // POST increment  = Print first and then increase
        // PRE increment  = Increment and then Print

        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

        int e = 10;
        int result = ++e;
        System.out.println(e);
        System.out.println(result);


        int f = 10;
        int result1 = f++;
        System.out.println(f);
        System.out.println(result1);

        int g = 10;
        System.out.println(g++ + g);

        int h = 10;
        System.out.println(h++ + ++h);
        System.out.println(h);

        int u = 10;
        System.out.println(++u + ++u);
        System.out.println(u);

        int p = 10;
        int result_post = p--;
        System.out.println(result_post);
        System.out.println(p);

        int l= 10;
        int resulte = --l;
        System.out.println(resulte);
        System.out.println(l);


    }
}
