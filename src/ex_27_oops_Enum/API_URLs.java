package ex_27_oops_Enum;

public enum API_URLs {
    VWO("vwo.login"),
    Katalon("www.katalon.com"),
    IntellIj("www.intellIj.in");


    private String webUrls;

    API_URLs(String webUrls){
        this.webUrls=webUrls ;
    }

    String getWebUrls(){
        return this.webUrls;
    }

}
