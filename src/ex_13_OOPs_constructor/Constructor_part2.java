package ex_13_OOPs_constructor;

public class Constructor_part2 {
    public static void main(String[] args) {
        Navy n1 = new Navy();
    }
}
class Navy{
    String name;
    int age;
    void talk(){}
}

// Here although the default constructor is not initialized -> whenver object is created default constructor will be called internally
