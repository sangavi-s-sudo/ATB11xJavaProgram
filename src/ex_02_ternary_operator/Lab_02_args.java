package ex_02_ternary_operator;

public class Lab_02_args {
    public static void main(String[] args) {

        String age1 = args[1];
        String age2 = args[0];

        System.out.println(age1);
        int age = Integer.parseInt(age1);
        String calc = (age < 18)? "minor" : ((age < 60) ? "Adult": "Senior Citizen");
        System.out.println(calc);
    }
}
