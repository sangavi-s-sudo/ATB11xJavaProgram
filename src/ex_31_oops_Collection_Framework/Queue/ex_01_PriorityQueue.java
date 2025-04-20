package ex_31_oops_Collection_Framework.Queue;

import java.util.PriorityQueue;

public class ex_01_PriorityQueue {
    public static void main(String[] args) {
        //Queue -> not used in automation mostly
        PriorityQueue pq = new PriorityQueue(); //doesnot maintain any order. It will take any elements from the heap area
//         pq does natural sorting
        pq.add("Sangavi");
        pq.add("Naveen");
        pq.add("Ithanya");
        System.out.println(pq);
        System.out.println("--------------");
        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq);

// PriorityQueue keeps the smallest element first, but not in sorted order.
// if you want to use sorted order
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }


    }
}
