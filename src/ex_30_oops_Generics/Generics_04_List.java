package ex_30_oops_Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics_04_List {
    public static void main(String[] args) {
        List int0 = new ArrayList(); // Here the type is not mentioned - so it will have any data types like  INT, STR, DOUBLE, FLOAT...
        List<Integer> int1 = new ArrayList();
        List<String> int2 = new ArrayList();
        List<Double> int3 = new ArrayList();
        List<Boolean> int4 = new ArrayList();
    }
}


// List is used in  Collection Framework ->
// List is the collection of items -> items can be 12,3, pramd, dutta.(like bunch of int, String , Double)