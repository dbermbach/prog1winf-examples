package berlin.tu.mcc.prog1.ws2324;


public class Main {

    public static void main(String[] args) {

        User u1 = new User("Martin", "grambow@tu-berlin.de", "geheim");
        User u2 = new User("Martin", "grambow@tu-berlin.de", "geheim");
        User u3 = new User("Martin", "grambow@tu-berlin.de", "geheim");

        if (u1.equals(u2) && u2.equals(u3)) {
            System.out.println("sind gleich");
        } else {
            System.out.println("nicht gleich");
        }


        Shirt s1 = new Shirt("Ein Shirt", 5000);
        s1.setSize("XL");

        Jeans j1 = new Jeans("Eine Jeans", 8000, 34);
        j1.setLength(34);
        j1.setColor("black");
        j1.setColor("orange");

        Order o = new Order(u1, s1, j1);
        System.out.println(o.getProducts()[1]);

    }
}
