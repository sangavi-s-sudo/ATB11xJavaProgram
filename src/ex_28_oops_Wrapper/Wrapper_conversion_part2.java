package ex_28_oops_Wrapper;

public class Wrapper_conversion_part2 {
    public static void main(String[] args) {
        String num = "100";
        int a = 10;

        // How to convert String to wrapper class ? or How to convert String to primitive data type?
        // By using  two ways -> ParseInt and valueOf

        Integer b = Integer.parseInt(num); // String to Wrapper
        int h = Integer.parseInt(num); //  - String to Primitive (INT)
        Integer aaa = Integer.valueOf(num); // String to wrapper class
        System.out.println(b);
        System.out.println(aaa);
        System.out.println("------------");



        // How to convert wrapper  to String?
        // By using .toString()
        String cd = Integer.toString(aaa);

        // How to convert primitive data type (int) to String
        int age = 10;
        Integer age_wrapper = age;
        String ef = Integer.toString(age_wrapper);
        System.out.println(age_wrapper.toString());
    }
}
