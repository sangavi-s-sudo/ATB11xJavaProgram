package ex_29_oops_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class No_14_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("c://abc.txt");
    }
}

//We can handle the exception in two ways :
//1. try catch block
//2. Using throws (by clicking on add exception to method signature)

//
//Diff between try catch and throws
//Aspect         	        try-catch	                                 throws
//Purpose       	        Handle exception	                         Declare exception for caller to handle
//Control flow	            Catches and processes it	                 Passes the responsibility
//Usage location	        -In the method where exception occurs	     In method signature
//Common for	            Runtime and checked exceptions	             Mostly checked exceptions
//Example	                Logging or retry logic	                     File reading or network code
