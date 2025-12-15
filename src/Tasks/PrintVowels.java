package Tasks;

public class PrintVowels {
    public static void main(String[] args) {
        String input = "My name is Sangavi";
        String vowels = "aeiouAEIOU";
        
        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                System.out.print(ch);
            }
        }
    }
}