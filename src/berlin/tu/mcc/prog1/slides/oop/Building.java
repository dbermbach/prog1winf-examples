package berlin.tu.mcc.prog1.slides.oop;

public abstract class Building {

    void repair(){
        replaceRoof();
        paint();
    }

    abstract void replaceRoof();
    abstract void paint();
}

class Tower extends Building {
    @Override
    void replaceRoof() {
        System.out.println("Need a helicopter.");
    }

    @Override
    void paint() {
        System.out.println("Have fun climbing!");
    }
}

class Kennel extends Building {
    @Override
    void replaceRoof() {
        System.out.println("Need some wood.");
    }

    @Override
    void paint() {
        System.out.println("Don't get bitten!");
    }
}


class MainClass{
    public static void main(String[] args) {
        Tower t = new Tower();
        Building b = new Kennel();
        t.repair();
        b.repair();
        t.paint();
        b.paint();
    }
}