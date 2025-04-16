package ex_31_oops_Collection_Framework.List;

import java.util.ListIterator;
import java.util.Vector;

public class ex_09_Vector_List_iterator {
    public static void main(String[] args) {
        Vector<String > vector = new Vector<>();
        vector.add("ITEM1");
        vector.add("ITEM2");
        vector.add("ITEM3");
        vector.add("ITEM4");
        vector.add("ITEM5");

        ListIterator listIterator = vector.listIterator(vector.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
