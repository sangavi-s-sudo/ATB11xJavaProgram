package Tasks;

public class Task_17_oops_constructor {
    public static void main(String[] args) {
        // call default constructor
     Persons p1 = new Persons();
        System.out.println(p1.isMale);
        System.out.println(p1.name);
        System.out.println("----------------------------------");
        // Initialize instance variables
        Persons p2 = new Persons();
        p2.name="Sangavi";
        p2.address= "BANGALORE";
        p2.isMale= false;
        p2.phone = 88888888888L;
        p2.weight = 55.9;
        p2.eat();
        p2.sleep("naveen");
        System.out.println(p2.walk());
        System.out.println(p2.inHome(true));

        System.out.println("----------------------------------");

        // Parametrized constructor
        Persons p3 = new Persons("Ithanya",2,"Maveripatti",22222222222L,false,10);

        System.out.println(p3.name);
        System.out.println(p3.address);
        System.out.println("----------------------------------");
        p3.eat();
        p3.sleep("sss");
        System.out.println(p3.walk());
        System.out.println(p3.inHome(false));
        System.out.println("----------------------------------");

// constructor overloading
        Persons p4 = new Persons("ABDE", "NATIVE", true, 56.7);
        System.out.println(p4.name);
        System.out.println(p4.address);
        System.out.println(p4.isMale);
        System.out.println(p4.phone);
        System.out.println(p4.age);
        System.out.println("----------------------------------");

        p4.eat();
        p4.sleep("yyy");
        System.out.println(p4.walk());
        System.out.println(p4.inHome(true));


    }
}

class Persons {
    String name;
    int age;
    String address;
    long phone;
    boolean isMale;
    double weight;

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep(String name) {
        System.out.println(name + " is sleeping");
    }

    long walk() {
        return age ;
    }

    boolean inHome(boolean isMale) {
        return isMale;
    }

    Persons(){
         name  = "unknown";
         age = 1;
         address = "not specified";
         phone = 111;
         isMale = false;
         weight = 1.1;
    }

    Persons(String name_args, int age_args, String address_args, long phone_args, boolean isMale_args, double weight_args){
        name = name_args;
        age= age_args;
        address = address_args;
        phone= phone_args;
        isMale = isMale_args;
        weight = weight_args;
    }

    Persons(String name_args_o, String addres_args_o, boolean ismale_args_o, double weight_args_o){
        name = name_args_o;
        address = addres_args_o;
        isMale = ismale_args_o;
        weight = weight_args_o;
    }

}
