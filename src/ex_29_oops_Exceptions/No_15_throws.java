package ex_29_oops_Exceptions;

import java.io.File;
import java.io.FileInputStream;

public class No_15_throws {
    public static void main(String[] args) throws Exception {// all exceptions are handled here using throws
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
        String s1 = null;
        s1.trim();
        int a = 10/0;
        File file = new File("");
    }


    // throws can be used in any method
    static void t() throws Exception{
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}
