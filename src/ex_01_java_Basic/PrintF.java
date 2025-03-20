package ex_01_java_Basic;

public class PrintF {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("my variable is %d\n ", a);
        int b = 30;
        System.out.printf("%d - %d\n", a, b);

        int c = 20;
        System.out.println( " --- ");
        System.out.printf("%d + %d\n",a,c);
        final int g = 10;
        int hex = 0b101;
        System.out.println( hex);

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F66';
        System.out.println(c11);
        char c1 = 'A', c2 = 'B';
        System.out.println(c1 + c2);

        int[] arrays_of_items = new int[10];
        System.out.println(arrays_of_items);
    }
}
