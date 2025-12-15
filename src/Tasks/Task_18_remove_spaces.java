package Tasks;

public class Task_18_remove_spaces {
    public static void main(String[] args) {
        String str = " G es eks for Ge eks ";
        String removeSpace = "";
        for (int i = 0; i<str.length();i++){
            if(str.charAt(i)== ' '){
                removeSpace =  removeSpace+"";
            }
            else{
                removeSpace = removeSpace  +str.charAt(i);
            }
        }
        System.out.println(removeSpace);





    }
}

