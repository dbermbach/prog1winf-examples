package berlin.tu.mcc.prog1.slides.oop.innerclasses;

public class Skyscraper {

    private final Elevator elevator;

    private final Floor[] floors;

    public Skyscraper(int numberOfFloors) {
        floors = new Floor[numberOfFloors];
        for (int i = 0; i < numberOfFloors; i++) floors[i] = new Floor(i);
        elevator = new Elevator();
        elevator.current = floors[0];
    }

    public void takeElevator(Floor start, Floor end) {
        if (start == null || end == null) {
            System.out.println("invalid trip");
            return;
        }
        while (elevator.isAbove(start)) elevator.down();
        while (elevator.isBelow(start)) elevator.up();
        elevator.stop();
        while (elevator.isAbove(end)) elevator.down();
        while (elevator.isBelow(end)) elevator.up();
        elevator.stop();
    }

    public Floor getFloorForNumber(int num) {
        if (num < 0 || num > floors.length) return null;
        return floors[num];
    }

    private class Elevator {

        private Floor current;

        boolean isBelow(Floor f) {
            return current.number < f.number;
        }

        boolean isAbove(Floor f) {
            return current.number > f.number;
        }

        void up() {
            if (current.number < floors.length - 1) current = floors[current.number + 1];
            System.out.println("on floor " + current.number);
        }

        void down() {
            if (current.number > 0) current = floors[current.number - 1];
            System.out.println("on floor " + current.number);
        }

        void stop() {
            System.out.println("letting people leave and enter");
        }

    }


    public class Floor {
        public final int number;

        Floor(int number) {
            this.number = number;
        }
    }
}

class Inhabitant {
    public static void main(String[] args) {
        Skyscraper s = new Skyscraper(10);
        s.takeElevator(s.getFloorForNumber(3), s.getFloorForNumber(8));
    }
}
