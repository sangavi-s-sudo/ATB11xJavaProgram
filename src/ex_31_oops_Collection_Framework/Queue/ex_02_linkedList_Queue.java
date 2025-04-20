package ex_31_oops_Collection_Framework.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ex_02_linkedList_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(3);
        queue.add(1);
        queue.add(12);
        queue.add(0);

        System.out.println(queue);  // It doesn't do any sorting takes the user input and print it
        System.out.println("---------");
        //or we can print using iterator.


        Iterator iterator = queue.iterator();   // in automation we use this
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }

        }
    }

