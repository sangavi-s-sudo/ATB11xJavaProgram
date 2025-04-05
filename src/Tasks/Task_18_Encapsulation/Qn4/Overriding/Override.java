package Tasks.Task_18_Encapsulation.Qn4.Overriding;

public class Override {
    public static void main(String[] args) {
        Mother m1 = new Mother();
        m1.doTask();

        Daughter d1= new Daughter();
        d1.doTask();

    }
}

class Mother{
    void doTask(){
        System.out.println("Do dancing");
    }
}

class Daughter extends Mother{
    @java.lang.Override
    void doTask(){
        System.out.println("do swimming");
    }
}
