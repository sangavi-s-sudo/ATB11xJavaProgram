package ex_28_oops_Wrapper;

public class All_class_using_wrappper {
    public static void main(String[] args) {
        Mobile iphone = new Mobile(1, "iphone", 120000.0);
        iphone.display();
        iphone.setPrice(1500000.0);
        iphone.display();
        Mobile Samsung = new Mobile();
        System.out.println("==========");

        System.out.println(Mobile.mobileCarrier);
        Mobile.getMobileCarrier();

        System.out.println("==========");
        oldPhone ref1 = new oldPhone();
        ref1.dial();
        iphone.dial();
        System.out.println("==========");


        Samsung.newfunc(1);
        iphone.newfunc("abc", 190.9);
    }
}

class Mobile extends oldPhone {
    private Integer Phone;
    private String name;
    private Double price;
    static int mobileCarrier = 2;

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    Mobile() {
        System.out.println("DC");
    }

    Mobile(Integer phone, String names, Double prices) {
        Phone = phone;
        name = names;
        price = prices;
        System.out.println("print values of parametrized constructor");
    }

    void display() {
        System.out.println("All values of phone" + Phone + name + price);
    }

    static void getMobileCarrier() {
        System.out.println("Static method called");
    }

    @Override
    void dial() {
        super.dial();
        System.out.println("dialpad changed to touch");
    }

    void newfunc(int a){
        System.out.println("newfunc1" + 10);
    }

    void newfunc(String b , double c){
        System.out.println("newfunc1"+ b + c);
    }
}

class oldPhone implements SimCard{
    void dial(){
        System.out.println("dialpad in old phone");
    }

    @Override
    public void enterCard() {
        System.out.println("card enetered");
    }
}

interface SimCard{
    default void enterCard(){
    }
}

