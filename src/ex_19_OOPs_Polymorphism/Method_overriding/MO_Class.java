package ex_19_OOPs_Polymorphism.Method_overriding;

public class MO_Class {
    public static void main(String[] args) {
        DashboardLogin l1 = new DashboardLogin();
        l1.setUsername("abc");
        l1.setPassword("esrtdyfgujhbnm");
        System.out.println(l1.getPassword());
        System.out.println(l1.getUsername());
    }

}

class DashboardLogin{
    private String username;
    private String password;


    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String usr){
        username = usr;
    }

    public void setPassword(String pass){
        password = pass;
    }

}