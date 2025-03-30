package ex_09_Strings;

public class StringBuffer_vs_StringBuilder {
    public static void main(String[] args) {
        String s0 = "Sangavi";
        String s1 = new String(" Naveen");

        StringBuffer stringBuffer = new StringBuffer("ABCD");
        StringBuilder stringBuilder = new StringBuilder("FGHI");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        String s3 = s0 + s1;
        System.out.println(s3);

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

        stringBuilder.append(123);
        System.out.println(stringBuilder);

        stringBuilder.delete(4,9);
        System.out.println(stringBuilder);

        stringBuffer.replace(3,4,"c");
        System.out.println(stringBuffer);

    }
}
