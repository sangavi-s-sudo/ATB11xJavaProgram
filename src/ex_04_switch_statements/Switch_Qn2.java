package ex_04_switch_statements;

public class Switch_Qn2 {
    public static void main(String[] args) {
        long a = 30l;
        int b = (int) a;
        System.out.println(b);
        switch (b) {
            case 3 :
                System.out.println("ws");
                break;
            case 30 :
                System.out.println("wss");
                break;
            default:
                System.out.println(("no ans"));
        }
    }
}
