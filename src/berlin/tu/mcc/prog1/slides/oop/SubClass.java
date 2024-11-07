package berlin.tu.mcc.prog1.slides.oop;

public class SubClass extends ParentClass {
    Helper hs = new Helper("instance sub");

    SubClass(){
        this("this call sub");
        System.out.println("back in sub");
    }

    SubClass(String s){
        System.out.println(s);
    }
}

class ParentClass extends GrandParentClass{
    Helper hp = new Helper("instance parent");
    Helper hp2 = new Helper("instance parent2");

    ParentClass(){
        System.out.println("parent");
    }

}

class GrandParentClass{
    GrandParentClass(){
        System.out.println("grandparent");
    }
}

class Main {
    public static void main(String[] args) {
        SubClass sc = new SubClass();
    }
}
