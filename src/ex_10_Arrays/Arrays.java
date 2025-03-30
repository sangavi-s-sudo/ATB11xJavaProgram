package ex_10_Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        boolean[] is_java = {true,false, true};
        System.out.println(is_java.length);
        System.out.println(a.length);
        System.out.println(a[0]);
        System.out.println(a[3]);
        //System.out.println(a[9]); // ArrayIndexOutOfBoundsException
      //  System.out.println(a[-1]);// ArrayIndexOutOfBoundsException
    }
}
