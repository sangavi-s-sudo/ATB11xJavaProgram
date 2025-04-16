package ex_30_oops_Generics;

import java.util.ArrayList;

public class Generics_practice {
    public static void main(String[] args) {

        Gene< Integer > ref1 = new Gene(5);
        System.out.println(ref1.temp_data(10));
    }
}

class Gene< u > {
    u number;


    public u temp_data(u number) {
        return number;
    }

    Gene(u numbers) {
        System.out.println("I am PC");
    }
}

