package ex_14_OOPs_single_inheritance;

public class TestCase1 {
    public static void main(String[] args) {
        Testcases1 tc1 = new Testcases1();
        tc1.eat();

    }

}
class Testcases1 extends Common_all {
    void eat(){
        startBrowser();
        System.out.println("TC1");
        readExcelFile();
    }
}
