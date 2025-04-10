package ex_27_oops_Enum;

public class Enum1 {
    public static void main(String[] args) {
        System.out.println(Colors.RED.getHexcode());
        System.out.println(Colors.GREEN.getHexcode());

        System.out.println("---------");

        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println("----------");

        System.out.println(API_URLs.IntellIj.getWebUrls());
    }
}

