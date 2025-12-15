package Tasks;
// ✅ Count vowels(a,e,i,o,u) and consonants in a String. → pramod, → vowels - 2, consonants - 4
public class Task_08 {
    public static void main(String[] args) {
       String s = "sangavi";
       int vowels = 0;


        for (int i =0 ; i <s.length();i ++){

            if((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i')|| (s.charAt(i) == 'o')|| (s.charAt(i) == 'u')){
                vowels = vowels +1;
            }
        }

        System.out.println(vowels);
        int consonants = s.length() - vowels;
        System.out.println(consonants);


        System.out.println("sangavi".indexOf('a'));



    }
}
