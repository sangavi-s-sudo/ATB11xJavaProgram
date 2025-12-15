package Tasks;

public class Task_21_Remove_zeros {
    public static void main(String[] args) {
        String b= "00023450";
        String str = "";
        for (int i = 0; i <b.length() ;i++){
            if(b.charAt(i)=='0'){
                str= ""+str;
            }else {
                str = str + b.charAt(i);
            }
        }

        System.out.println(str);
    }
}
