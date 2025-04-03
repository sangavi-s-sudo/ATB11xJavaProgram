package ex_14_OOPs_single_inheritance;

public class Testcase2 {
    public static void main(String[] args) {
        Testcases2 tc2 = new Testcases2();
        tc2.sleep();
    }
}
class Testcases2 extends Common_all{
    void sleep(){
        System.out.println("TC2 print");
        closeBrowser();
        readDataBaseFile();
    }
}
