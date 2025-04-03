package ex_19_OOPs_Polymorphism.Method_overriding;

public class Moverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.Sound();
        Animal a1 = new Animal();
        a1.Sound();
    }

}

class Animal{
    void Sound(){
        System.out.println("makes some sound");
    }
}
class Dog extends Animal{
    @Override
    void Sound(){
        System.out.println("BARK !!!!!!");
    }
}