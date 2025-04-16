public class Whole_revision {
    public static void main(String[] args) {

        Human sangavi = new Human();
        sangavi.name = "sangavi";
        sangavi.age = 10;
        sangavi.gender = "female";
        System.out.println(sangavi.gender);
        sangavi.canTalk();
    }
}
class Human{
    String name ;
    int age;
    String gender;
    long phoneNumber;
    double weight;


    void canTalk(){
    }
    void walk(){

    }
}
