package Tasks;

public class addreversesplit {
    public static void main(String[] args) {
        String input = "hello world from java";
        // Split the sentence into individual words
        String[] words = input.split(" ");

        // StringBuilder for efficiently building final output
        StringBuilder finalResult = new StringBuilder();

        // Process each word independently
        for (String word : words) {

            // Step 1: Reverse the word using StringBuilder reverse()
            String reversed = new StringBuilder(word).reverse().toString();

            // Step 2: Capitalize the first and last characters of the reversed word
            int length = reversed.length();

            // First character capitalized
            char firstChar = Character.toUpperCase(reversed.charAt(0));

            // Last character capitalized
            char lastChar = Character.toUpperCase(reversed.charAt(length - 1));

            // Middle part of the string (unchanged)
            String middle = "";
            if (length > 2) {
                middle = reversed.substring(1, length - 1);
            }

            // Combine first + middle + last
            String transformedWord = firstChar + middle + lastChar;

            // Step 3: Append transformed word with "@" separator
            finalResult.append(transformedWord).append("@");
        }

        // Remove the trailing '@' at the end
        System.out.println( finalResult.substring(0, finalResult.length() - 1));
    }
}
