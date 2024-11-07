package berlin.tu.mcc.prog1.slides.oop;

public class ApartmentHouse {
    Heating heating = new GasBoiler();

    void heat(){
        heating.heat();
    }

    public static void main(String[] args) {
        ApartmentHouse apt = new ApartmentHouse();
        apt.heat();
        apt.heating = new HeatPump();
        apt.heat();
        apt.heating = new Heating() {
            @Override
            void heat() {
                System.out.println("I'm an anonymous mystery heater!");
            }
        };

    }
}

abstract class Heating {
    abstract void heat();
}

class HeatPump extends Heating{
    @Override
    void heat() {
        System.out.println("I'm clean.");
    }
}

class GasBoiler extends Heating{
    @Override
    void heat() {
        System.out.println("I'm so dirty.");
    }
}