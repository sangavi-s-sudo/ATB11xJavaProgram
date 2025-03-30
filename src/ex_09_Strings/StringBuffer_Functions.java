package ex_09_Strings;

public class StringBuffer_Functions {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Ithanya");
        System.out.println(sb);

        sb.append(" Naveen");
        System.out.println(sb);

        sb.insert(5,"n");
        System.out.println(sb);

        sb.replace(3, 6, "rtyuiooooo");
        System.out.println(sb);

        sb.delete(3, 11);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);


        char c = sb.charAt(5);
        System.out.println("c: "+ c);

        sb.setCharAt(5,'S');
        System.out.println(sb);

        int x = sb.length();
        System.out.println(x);

        String b = sb.substring(5);
        System.out.println(b);

        String d = sb.substring(5, 8);
        System.out.println(d);

        sb.toString();
        System.out.println(sb);










    }
}
