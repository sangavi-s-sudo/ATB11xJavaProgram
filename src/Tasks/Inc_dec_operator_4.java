package Tasks;

public class Inc_dec_operator_4 {
    public static void main(String[] args) {

        int a = 13;
        System.out.println(++a + a++ + a++); // 11 +  11 + 12 // a= 12
        System.out.println(a);

        int b = 20;
        System.out.println( b++ + b-- + --b  ); // 21 + 19 + 19
        System.out.println( b);
    }
}
