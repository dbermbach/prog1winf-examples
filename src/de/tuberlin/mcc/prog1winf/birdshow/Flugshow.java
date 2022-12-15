package de.tuberlin.mcc.prog1winf.birdshow;

import java.util.ArrayList;
import java.util.List;

public class Flugshow {

    public void letFly(List<? extends CanFly> flyers){
        System.out.println("Starting flight show");
        for(CanFly c : flyers) {
            c.fly();
        }
    }

    public void foobar(List<?> list){
        list.remove((int)(Math.random()*list.size()));
    }

    public void letAllBirdsFly(List<Bird> birds){
        System.out.println("Starting bird flight show");
        for(Bird b: birds){
            if(b instanceof CanFly) ((CanFly) b).fly();
            else{b.sayName();
                System.out.println(" cannot fly.");}
        }
    }


    public static void main(String[] args) {
        List<CanFly> flyers = new ArrayList<>();
        Amsel horst = new Amsel("Horst");
        DummeAmsel honk = new DummeAmsel("Honk");
        Raumschiff raumschiff = new Raumschiff();
        flyers.add(horst);
        flyers.add(honk);
        flyers.add(raumschiff);
        flyers.add((Amsel)honk);
        Flugshow f = new Flugshow();
        f.letFly(flyers);
        List<Amsel> amseln = new ArrayList<>();
        amseln.add(honk);
        amseln.add(horst);
        f.letFly(amseln);
        //List<CanFly> list = new ArrayList<Amsel>(); -> geht nicht
        List<Bird> birds = new ArrayList<>();
        birds.addAll(amseln);
        birds.add(new Strauss("Dude"));
        f.letAllBirdsFly(birds);

    }

}
