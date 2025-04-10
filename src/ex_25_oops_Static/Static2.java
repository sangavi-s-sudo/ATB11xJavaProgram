package ex_25_oops_Static;

public class Static2 {
    public static void main(String[] args) {
        new Q(); // to create an object we need to load the class
        System.out.println("------");
        Q a; // there is no object created


    }
}
class Q{
    {
        System.out.println("IIB");
    }

    Q(){
        System.out.println("DC");
    }
    static{
        System.out.println("sttaic class");
    }
}
