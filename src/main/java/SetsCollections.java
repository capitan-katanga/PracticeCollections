import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetsCollections {
    public static void main(String[] args) {
        // Los sets son colecciones no ordenadas, que no permiten duplicados
        HashSet<String> carSet = new HashSet<>();
        carSet.add("Volvo");
        carSet.add("BMW");
        carSet.add("Ford");
        carSet.add("Mazda");
        // Se puede intentar agregar un elemento repetido, pero no cambiara el set
        carSet.add("Volvo");
        carSet.add("BMW");
        // Acepta elemento null
        carSet.add(null);
        carSet.add("Toyota");
        carSet.add("Chevrolet");
        carSet.add("Honda");

        // HashSet implementa la interfaz Set
        System.out.println("carSet instanceof HashSet: " + (carSet instanceof HashSet));
        System.out.println("carSet instanceof Set: " + (carSet instanceof Set));
        System.out.println("carSet instanceof Collection: " + (carSet instanceof Collection));
        System.out.println("carSet instanceof Iterable: " + (carSet instanceof Iterable));

        //Eliminar un elemento, devuelve true si el elemento existe
        System.out.println("Eliminar un elemento" + carSet.remove("Honda"));

        System.out.println("Card set: " + carSet);

        HashSet<String> bikeSet = new HashSet<>();
        bikeSet.add("Yamaha");
        bikeSet.add("Suzuki");

        System.out.println("Bike set: " + bikeSet);
        // Unir dos hashMap (Union)
        carSet.addAll(bikeSet);
        System.out.println("Car set + Bike set: " + carSet);

        //Interseccion entre 2 hashMap (Deja solo los elementos que coinciden en ambos set)
        carSet.retainAll(bikeSet);
        System.out.println("carSet intersection bikem set: " + bikeSet);

        // Eliminar los elementos que coinciden con otro array (Diferencia)
        carSet.removeAll(bikeSet);
        System.out.println("Card set: " + carSet);



    }
}
