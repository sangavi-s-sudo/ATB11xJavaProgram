package ex_27_oops_Enum;

public enum Colors {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexcode;

    Colors(String hexcode){
         this.hexcode = hexcode ;
    }

    String getHexcode(){
       return this.hexcode;
    }
}
