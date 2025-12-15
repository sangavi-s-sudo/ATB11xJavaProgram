package ex_20_OOPs_Encapsulation;

public class Encap_demo {
    public static void main(String[] args) {


        //## Encapsulation
        //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
        //- Bundling of data and methods that operate on that data within a single unit.
        // Keeping variables (data) and functions (methods) together inside one class and control how others use it.
        //- Data members should be private in nature.
        //- Methods with getter and setter only, you can access the data members / attributes.
        DashboardLogin d1 = new DashboardLogin("admin", "pass123");
        System.out.println(d1.username);
        System.out.println(d1.password);
        System.out.println("-------------");
        d1.username = "Sangavi";
        d1.password = "Jus123";
        System.out.println(d1.username);
        System.out.println(d1.password);
        System.out.println("-------------");


        DashboardPrivateLogin d2 = new DashboardPrivateLogin("admin1", "234545");
//        System.out.println(d2.username); both cannot be accessed outside the class as this is private attributes
//        System.out.println(d2.password);
// The encapsulated attributes can be accessed by using getter and setter access modifiers.
        // Getters and setters are functions/methods behaviors with this only they can access private variables
// // if you want instance variables to be acessed outside the class we need getters and setters
// And in the setters we can control the variable acess
// Getters and setters is not mandatory -its user's choice.
        System.out.println(d2.getPassword());
        System.out.println(d2.getUsername());
        System.out.println("-------------");

        d2.setUsername("ABcd");
        System.out.println(d2.getUsername());
        System.out.println("-------------");

        d2.setPassword("pass233444", false);
        System.out.println(d2.getPassword());
        System.out.println("-------------");

        d2.setPassword("pass233444", true);
        System.out.println(d2.getPassword());

        System.out.println("-------------");


    }
}

class DashboardLogin {
    public String username;
    public String password;

// parametrized constructor
    DashboardLogin(String usr, String pass) {
        username = usr;
        password = pass;
    }
}

class DashboardPrivateLogin {
    private String username;
    private String password;
// private can be accessed within the class and not outside the class


    DashboardPrivateLogin(String usr1, String pass1) {
        username = usr1;
        password = pass1;
    }

    public String getPassword() {
        return password;
    }

    // As password should not be modified outside the class except by admin
    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("you are not allowed to change the password!!!");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
