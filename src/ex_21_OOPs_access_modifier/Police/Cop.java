package ex_21_OOPs_access_modifier.Police;

public class Cop {
    private int gun;
    String iCard;

    public Cop(int bullet){
        this.gun = bullet;
        System.out.println(gun);
    }
    protected void CanIShoot(){
        System.out.println("yes! you can shoot.");
    }
}
