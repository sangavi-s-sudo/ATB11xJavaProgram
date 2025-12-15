package Tasks;

public class Task_30_toggle_each_word {
    public static void main(String[] args) {
        String str = "This is Sangavi Am Writing";
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            // Toggle logic
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch); // Keep spaces/special characters as is
            }
        }
        System.out.println(sb);

    }}

