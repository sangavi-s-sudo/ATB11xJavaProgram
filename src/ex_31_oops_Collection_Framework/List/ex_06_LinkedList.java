package ex_31_oops_Collection_Framework.List;

import java.util.LinkedList;

public class ex_06_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList(); // apart from string type we can't add anything
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");

        System.out.println(animals);

        // Accessing elements
        System.out.println(animals.getFirst());
        System.out.println(animals.getLast());



        // Removing elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal: " + animals);

        System.out.println("Size of LinkedList: " + animals.size());
    }
}
