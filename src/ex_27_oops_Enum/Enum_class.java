package ex_27_oops_Enum;

public class Enum_class {
    public static void main(String[] args) {
        System.out.println(day.MONDAY);
        System.out.println(project_urls.restAssured);

        A ref1= new A();
        System.out.println(ref1.days[5]);

    }
}
class A{
    String[] days = {"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};
}

enum day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum project_urls{
    google, restAssured, katalon, vwo
}
