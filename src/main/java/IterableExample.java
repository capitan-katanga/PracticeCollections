import java.util.ArrayList;
import java.util.Iterator;

public class IterableExample {
    public static void main(String[] args) {

        ArrayList<String> latamCities = new ArrayList<>();

        latamCities.add(0, "Cordoba");
        latamCities.add(1, "Asuncion");
        latamCities.add(2, "Santiago de Chile");
        latamCities.add(3, "Montevideo");
        latamCities.add(4, "Lima");
        latamCities.add(5, "La Paz");

        Iterable<String> latamCitiesIterable = latamCities;

        // Se puede iterar en in for each
        for (String city : latamCitiesIterable) {
            System.out.println(city);
        }

        // Iterable posee un metodo para obtener el objeto iterator
        // Iterator posee metodos para recorrer un array
        Iterator<String> iterator = latamCitiesIterable.iterator();
        System.out.println("\nRecorrer con iterator");

        // hasNext devuelve true si existe el puntero del iterator tiene un elemento siguiente
        while (iterator.hasNext()) {
            // next cambia el punto de iterator al elemento siguiente (devuelve el puntero que cambio)
            System.out.println(iterator.next());
        }

        System.out.println(iterator.hasNext());

    }
}
