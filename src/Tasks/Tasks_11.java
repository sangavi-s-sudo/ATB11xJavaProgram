package Tasks;

public class Tasks_11 {
    public static void main(String[] args) {
        String input = "sangavi";
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
                vowels++;

            } else {
                consonants++;
            }
        }
        System.out.println("number of vowels are : " + vowels);
        System.out.println("number of consonants are : " + consonants);

    }
}
