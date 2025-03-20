package ex_02_java;

public class TypeCastimg_Qn {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        int Total = course + (int)GST;
        System.out.println(Total);
        float Total1 = course + GST;
        System.out.println(Total1);

    }
}
