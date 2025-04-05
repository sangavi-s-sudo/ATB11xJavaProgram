package ex_21_OOPs_access_modifier.Police;

public class JuniorCop {
    public static void main(String[] args) {
        Cop c2 = new Cop(4);
        c2.CanIShoot();

        // here Junior cop is allowed to shoot
    }
}
