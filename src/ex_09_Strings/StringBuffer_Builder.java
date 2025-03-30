package ex_09_Strings;

public class StringBuffer_Builder {
    public static void main(String[] args) {
        String s1 = "Sangavi";
        String s2 = new String("Sangavi");

        StringBuffer stringBuffer = new StringBuffer("Sangavi");
        StringBuilder stringBuilder = new StringBuilder("Sangavi");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
