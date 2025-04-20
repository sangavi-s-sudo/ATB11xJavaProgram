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
    public String toString() { // By default, toString() returns something like Student@6f94fa3e  Which is the class name and memory reference — not helpful. But when you override it, you can control the output:
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




