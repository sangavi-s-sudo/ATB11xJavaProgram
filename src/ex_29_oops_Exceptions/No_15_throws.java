package ex_29_oops_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

class Example {
    // This method declares that it may throw an IOException
    void readFile() throws IOException {
        FileReader file = new FileReader("daascata.txt");
        file.close();
    }

    public static void main(String[] args) {
        Example obj = new Example();
        try {
            obj.readFile(); // must handle or declare IOException
        } catch (IOException e) {
            System.out.println("File not found or cannot be read!");
        }
    }
}