package ex_26_oops_Static;

public class Static_real {
    public static void main(String[] args) {
        ATB.doAssignment();
        ATB.joinZoomForClass();
        System.out.println(ATB.courseName);
        System.out.println(ATB.mentorName);

        ATB ref = new ATB();
        ref.setName("amit");
        ref.setPhone("976543210");
        ref.howTheydoAssignment();
        System.out.println(ref.getName());
        System.out.println(ref.getPhone());
    }
}

class ATB {
    static {
        System.out.println("Load the class?, I will execute");
    }

    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }
    ATB(){
        System.out.println("constructor is called after IIB");
    }

    private String name; // non static

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String phone;
    static String courseName = "ATB11x";
    static String mentorName = "Pramod";

    static void doAssignment() {
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass() {
        System.out.println("Class Joined!");
    }


    void howTheydoAssignment() {
        System.out.println("It is different!");
    }
}