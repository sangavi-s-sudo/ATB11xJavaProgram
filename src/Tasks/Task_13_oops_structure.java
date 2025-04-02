package Tasks;

public class Task_13_oops_structure {
    public static void main(String[] args) {
        Person P1 = new Person();
        P1.name = "Sangavi";
        P1.isMarried = true;
        P1.age= 25;
        P1.color= "blue";
        P1.gender= "FE";
        P1.weight = 55.9;

        P1.talk();
        System.out.println(P1.non_params());
        P1.name("Naveen");
        System.out.println(P1.greet("white", 55.4,"Female"));
    }
}

class Person {
    String name;
    String color;
    int age;
    double weight;
    boolean isMarried;
    String gender;

    void talk(){
        System.out.println("1st type");
    }

    void  name (String name){
        System.out.println("Type your name");
    }

    String greet  (String color ,double weight, String gender ){
        return color + weight + gender;
    }
    String non_params(){
        return name + color + age + weight + gender + isMarried;
    }
}
