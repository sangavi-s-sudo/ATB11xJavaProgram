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
       // An Iterator is an object that enables you to traverse (loop through) a collection (like a List, Set, or Vector) one element at a time, without exposing the underlying structure.
        ListIterator listIterator = vector.listIterator(vector.size());

        // vector.listIterator(int index) returns a ListIterator that starts at the specified index.
        //
        //Here, it's initialized with vector.size() (which is 5), so it starts at the end of the list.
        //
        //ListIterator is a bidirectional iterator — it can move forward and backward through the list.
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
// ListIterator is used to iterate in reverse.
// vector.listIterator(vector.size()) sets the pointer at the end of the list.
// hasPrevious() checks if there's an element before the current position.
// previous() returns elements in reverse order.