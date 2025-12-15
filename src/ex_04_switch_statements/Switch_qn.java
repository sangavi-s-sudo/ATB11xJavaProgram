package ex_04_switch_statements;

public class Switch_qn {
    public static void main(String[] args) {
        boolean b = false;
        //switch (b) {  // we cannot use booleans in Switch

        String value = b ? "true": "false";
        System.out.println(value);

        switch (value){
            case "true":
                System.out.println("the value is true");
                break;
            case "false":
                System.out.println("the value is false");
                break;
            default:
                System.out.println("no vlaue");
        }
    }
}
