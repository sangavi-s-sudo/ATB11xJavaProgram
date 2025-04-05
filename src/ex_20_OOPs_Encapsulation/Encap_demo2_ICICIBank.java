package ex_20_OOPs_Encapsulation;


public class Encap_demo2_ICICIBank {
    public static void main(String[] args) {
        ICICI I1 = new ICICI("Sangavi",345.6);
        System.out.println(I1.getBalance());
        System.out.println(I1.getName());

        System.out.println("----------");

        I1.setBalance(500.0,true);
        System.out.println(I1.getBalance());
        System.out.println("----------");

        I1.setBalance(5009.0,false);
        System.out.println(I1.getBalance());




    }

}

class ICICI{
    private String name ;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance, boolean isCashier) {
        if (isCashier){
        this.balance = balance;}
        else {
            System.out.println("You cannot update the balnce");
        }
    }

    ICICI(String names1, double bal ){
        name= names1;
        balance = bal;

    }
}
