package ex_21_OOPs_access_modifier.Thief;

import ex_21_OOPs_access_modifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c1 = new Cop(3);
        //c1.CanIShoot();
        //System.out.println(c1.gun);

        // if we make as private we cannot access here
    }
}
