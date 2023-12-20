import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Fruit frutta1 = new Fruit("Mela");
        Fruit frutta2 = new Fruit("Pera");
        Fruit frutta3 = new Fruit("Fragola");

        LinkedList<Fruit> listaFrutte = new LinkedList<>();
        listaFrutte.add(frutta1);
        listaFrutte.add(frutta2);
        listaFrutte.add(frutta3);

        System.out.println(listaFrutte);

        listaFrutte.addFirst(new Fruit("Kiwi"));
        listaFrutte.addLast(new Fruit("Banana"));

        System.out.println(listaFrutte);
    }
}