package ex_20_OOPs_Encapsulation;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Rahul");   // setting value
        s.setAge(20);         // valid age
        s.setAge(-5);         // invalid, rejected

        System.out.println(s.getName()); // Rahul
        System.out.println(s.getAge());  // 20
    }
}




class Student {
    // private data (hidden)
    private String name;
    private int age;

    // getter (to read data)
    public String getName() {
        return name;
    }

    // setter (to modify data safely)
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {          // validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}
