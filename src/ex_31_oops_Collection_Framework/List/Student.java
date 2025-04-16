package ex_31_oops_Collection_Framework.List;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    private String name;
    private String rollNo;

    Student (String names, String rolls){
        name = names;
        rollNo = rolls;
    }


    @Override  // by using override we will print the value of name , rollNo
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }

    void getDetails(){
        System.out.println(name);
        System.out.println(rollNo);
    }
}




