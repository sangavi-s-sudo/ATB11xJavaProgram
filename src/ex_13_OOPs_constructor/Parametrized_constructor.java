package ex_13_OOPs_constructor;

public class Parametrized_constructor {
    public static void main(String[] args) {
        Cars c1 = new Cars();
        System.out.println(c1.greet());
        Cars c2 = new Cars("BMW",2023);
        System.out.println(c2.greet());
        Cars c3 = new Cars ("VOLKSWAGEN", 2023);
        System.out.println(c3.greet());
        Cars c4 = new Cars("ABC");
        System.out.println(c4.greet());

    }
}

class Cars {
    String brand;
    int year;

    String greet() {
        return brand + "_" + year;
    }

    Cars() {
        brand = "unknown";
        year = 1991;
    }

    Cars(String brand_args, int year_args){
        brand = brand_args;
        year = year_args;
    }

    Cars(String brand_args_1){
        brand = brand_args_1;
    }
}
