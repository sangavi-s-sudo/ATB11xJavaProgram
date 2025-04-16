package ex_31_oops_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Scanner;

// Multiple inputs from the user and store them in separate
// names, ages - store them
public class ex_12_user_input_AL {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        ArrayList<String> names = new ArrayList();
        ArrayList<Integer> age = new ArrayList();

        System.out.println("Enter the name: ");
        String name = scanner.next();
        names.add(name);

        System.out.println("Enter the age: ");
        Integer ages = scanner.nextInt();
        age.add(ages);

        scanner.close();


        for(Object o: names){
            System.out.println(name);
        }

        for(Object o: age){
            System.out.println(ages);
        }
    }
}
