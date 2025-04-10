package ex_25_oops_Static;

public class Static {
    public static void main(String[] args) {
       P a = new P();

       // p is class (class loader loads it) -> here SIB will be called
        // a is reference
        // new P() is object creation -> IIb and DC will be called here
        System.out.println("-----");
        P b = new P();
        // static can be called only once but IIB and constructors can be called based on object creation.
        // why static is called only once ? because only one time the class is loaded. Becoz if you create multiple objects , but class will load only one time.
//here IIb -> 2 times
//     DC -> 2 times
//     SIB -> 1 times
    }
}
class P{
    P(){
        System.out.println("DC");
    }
    {
        System.out.println("IIB");
    }
    static {
        System.out.println("static class");
    }
}
// when object is created ->  it will call first static , IIB then DC in order.
