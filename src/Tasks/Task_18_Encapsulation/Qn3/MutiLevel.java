package Tasks.Task_18_Encapsulation.Qn3;

public class MutiLevel {
    public static void main(String[] args) {
        GrandMother gm1 = new GrandMother();
        Mother m1 = new Mother();
        Daughter d1 = new Daughter();

        System.out.println(gm1.vessels_gm);
        gm1.show_gm();

        System.out.println(m1.vessels_gm);
        System.out.println(m1.vessels_m);
        m1.show_m();
        m1.show_gm();


        System.out.println(d1.vessels_Daugh);
        System.out.println(d1.vessels_gm);
        System.out.println(d1.vessels_m);

        d1.show_m();
        d1.show_gm();
        d1.show_Daugh();
    }
}

class GrandMother {
    int vessels_gm = 10;

    void show_gm() {
        System.out.println("grandma's gold");
    }
}

class Mother extends GrandMother {
    int vessels_m = 15;

    void show_m() {
        System.out.println("Mother's gold");
    }
}

class Daughter extends Mother {
    int vessels_Daugh = 20;

    void show_Daugh() {
        System.out.println("Daughter's gold");
    }
}

