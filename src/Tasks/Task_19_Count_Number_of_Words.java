package Tasks;

public class Task_19_Count_Number_of_Words {
    public static void main(String[] args) {
        String sentence = "              Java is easy to learn                          ";

        System.out.println(sentence.trim());
        // Remove extra spaces at start/end and split by space
        String[] words = sentence.trim().split(" ");

        // Count the number of words
//        int wordCount = words.length;

        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);
        System.out.println(words.length);
    }
}
