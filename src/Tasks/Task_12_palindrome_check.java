package Tasks;

public class Task_12_palindrome_check {
    public static void main(String[] args) {
        String input = "Xox";
        String str = "";
        for (int i = input.length()-1 ; i >=0 ;i--){
            char ch = input.charAt(i);
            str = str + ch;
         }
        boolean s = input.equalsIgnoreCase(str) ;
        System.out.println(s);
    }
}
