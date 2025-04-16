package ex_30_oops_Generics;

public class Generics_03_in_classes {
    public static void main(String[] args) {
        GenericClass <String> abc = new GenericClass("3");
        GenericClass <Integer> def = new GenericClass(6);
        abc.getData();
        def.getData();

    }
}
// t -> it is placeholder only -> it can be any data type.

class GenericClass <t>{
    private t data;

    public GenericClass(t a){
        data = a;
        System.out.println(data);
    }

    public t getData(){
        return data;
    }
}
