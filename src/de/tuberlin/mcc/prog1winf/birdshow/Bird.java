package de.tuberlin.mcc.prog1winf.birdshow;

public abstract class Bird {

    private String name;

    public Bird(String name){
        this.name = name;
    }

    public abstract void sayName();


    public String getName(){
        return this.name;
    }
}


class Amsel extends Bird implements CanFly{

    public Amsel(String name) {
        super(name);
    }

    @Override
    public void sayName() {
        System.out.print("Amsel " + this.getName());
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + ": I'm flying.");
    }
}

class DummeAmsel extends Amsel {


    public DummeAmsel(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + ": voll gegen die Wand.");
    }

}


class Strauss extends Bird{

    public Strauss(String name) {
        super(name);
    }

    @Override
    public void sayName() {
        System.out.print("Strauss " + this.getName());
    }
}

class Raumschiff implements CanFly{

    @Override
    public void fly() {
        System.out.println("Wroaaaam");
    }
}