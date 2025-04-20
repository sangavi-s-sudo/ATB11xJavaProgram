package ex_31_oops_Collection_Framework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ex_03_Array_deque {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque(); //natural sorting happens ----> resizeable array
        deck.push(15);
        deck.push(5);
        System.out.println(deck);

    }
}
