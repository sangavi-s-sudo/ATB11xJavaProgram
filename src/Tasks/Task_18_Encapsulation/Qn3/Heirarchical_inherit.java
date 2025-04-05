package Tasks.Task_18_Encapsulation.Qn3;

public class Heirarchical_inherit {
    public static void main(String[] args) {
        Sangavi s1 = new Sangavi();
        Friend s2 = new Friend();
        Brother s3 = new Brother();
        Mothers s4 = new Mothers();
        Husband s5 = new Husband();


        s1.dress();

        s2.Shoes();
        s2.dress();

        s3.bike();
        s3.dress();

        s4.gold();
        s4.dress();

        s5.money();
        s5.dress();
    }
}

class Sangavi {
    void dress() {
        System.out.println("my dress");
    }
}

class Friend extends Sangavi {
    void Shoes() {
        System.out.println("shoes");
    }
}

class Brother extends Sangavi {
    void bike() {
        System.out.println("Scooty");
    }
}

class Mothers extends Sangavi {
    void gold() {
        System.out.println("goldf");
    }
}

class Husband extends Sangavi {
    void money() {
        System.out.println("money from hus");

    }
}

