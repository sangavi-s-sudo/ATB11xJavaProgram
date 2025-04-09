package ex_24_oops_Abstraction_interface;

public class Interface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(10,20);

        Square r2 = new Square();
        r2.getArea(10,20);
    }
}

interface Polygon {
    void getArea(int length, int breadth);
}

class Rectangle implements Polygon {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area is " + length*breadth);
    }
}

class Square implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println(3.14* length);
    }
}
