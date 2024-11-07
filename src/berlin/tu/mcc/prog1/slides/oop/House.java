package berlin.tu.mcc.prog1.slides.oop;

public abstract class House {
    abstract void moveIn();
}

interface CanSwim {
    void swim();
}

class HouseBoat extends House implements CanSwim {
    @Override
    public void swim() {
        System.out.println("I am sailing!");
    }

    @Override
    void moveIn() {
        System.out.println("Home sweet home!");
    }

    public static void main(String[] args) {
        HouseBoat hb = new HouseBoat();
        hb.moveIn();
        hb.swim();
    }
}

class Duck implements CanSwim {
    @Override
    public void swim() {
        System.out.println("quack!");
    }
}

class Fish implements CanSwim {
    @Override
    public void swim() {
        System.out.println("blub.");
    }
}

class Lake {

    void letThemSwim(CanSwim... swimmers) {
        for (CanSwim cs : swimmers) cs.swim();
    }

    public static void main(String[] args) {
        Lake lake = new Lake();
        lake.letThemSwim(new HouseBoat(), new Duck(), new Duck());
    }
}

