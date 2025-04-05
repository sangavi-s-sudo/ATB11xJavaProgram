package Tasks.Task_18_Encapsulation;

public class Qn1 {
    public static void main(String[] args) {
        ATB a1 = new ATB("Java", 1, 10000);
//        System.out.println(a1.course);
        System.out.println(a1.getCourse());
        System.out.println(a1.getTeachersCount());
        System.out.println(a1.getCostOfCourse());
        a1.setCourse("Python");
        a1.setTeachersCount(2);
        System.out.println("----------");
        System.out.println(a1.getCourse());
        System.out.println(a1.getTeachersCount());
        System.out.println("----------");
        a1.setCostOfCourse(12000, true);
        System.out.println(a1.getCostOfCourse());

    }
}

class ATB {

    private String course;
    private int teachersCount;
    private float costOfCourse;

    ATB(String course1, int noOftrs, float cost) {

        course = course1;
        teachersCount = noOftrs;
        costOfCourse = cost;
    }

    public int getTeachersCount() {
        return teachersCount;
    }

    public void setTeachersCount(int teachersCount) {
        this.teachersCount = teachersCount;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getCostOfCourse() {
        return costOfCourse;
    }

    public void setCostOfCourse(float costOfCourse, boolean isAdmin) {
        if (isAdmin) {
            this.costOfCourse = costOfCourse;
        } else {
            System.out.println("you are not allowed to change the cost of the course");
        }
    }
}
