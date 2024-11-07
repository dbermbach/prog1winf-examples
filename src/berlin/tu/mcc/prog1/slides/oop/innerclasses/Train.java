package berlin.tu.mcc.prog1.slides.oop.innerclasses;

public class Train implements CanMove {

    private Wheel[] wheels = {new Wheel(), new Wheel(), new Wheel(), new Wheel()};

    @Override
    public void move() {
        for (Wheel w : wheels) w.rotate();
    }

    public static class Wheel implements Rotatable {
        @Override
        public void rotate() {
        }
    }
}

class Bike implements CanMove {

    private Wheel[] wheels = {new Wheel(), new Wheel()};

    @Override
    public void move() {
        for (Wheel w : wheels) w.rotate();
    }

    public static class Wheel implements Rotatable {
        @Override
        public void rotate() {
        }
    }

    void replaceWheels(Wheel front, Wheel back) {
        wheels[0] = front;
        wheels[1] = back;
    }
}

interface Rotatable {
    void rotate();
}

interface CanMove {
    void move();
}

class Traveler {
    public static void main(String[] args) {
        Train t = new Train();
        Bike b = new Bike();
        t.move();
        b.move();
        Bike.Wheel front = new Bike.Wheel();
        Bike.Wheel back = new Bike.Wheel();
        b.replaceWheels(front, back);
        
    }
}