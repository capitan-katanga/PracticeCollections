import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapLRUCache {
    public static void main(String[] args) {
        // Se pueden utilizar los linkedhashmap para implementar una cache Last Recently Used
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(
                16, 0.75f, true
        );
        linkedHashMap.put(1784, "The Godfather");
        linkedHashMap.put(1202, "Titanic");
        linkedHashMap.put(1503, "Jaws");
        linkedHashMap.put(1501, "Saving Private Ryan");

        // Al recorrer los elementos se visualizan en el orden en el que fueron insertados
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry);
        }

        // Accedemos a un elemento en particular
        System.out.println(linkedHashMap.get(1202));

        // Vemos como el elemento fue reubicado al final de la lista
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry);
        }

        // Otra manera mas correcta es creando una nueva clase que extienda de LinkedHashMap
        Map<Integer, String> lruCache = new LRUCache();
        lruCache.put(1784, "The Godfather");
        lruCache.put(1202, "Titanic");
        lruCache.put(1503, "Jaws");
        lruCache.put(1501, "Saving Private Ryan");
        lruCache.put(2501, "Back to the Future");

        System.out.println("\n###########Implementacion clase LRUCache###########\n");

        for (Map.Entry<Integer, String> entry : lruCache.entrySet()) {
            System.out.println(entry);
        }
        // Se el cache almacena los dos ultimos elementos insertados y elimina 2 primeros
        System.out.println("\nPut two new elements");
        lruCache.put(3000,"Parasite");
        lruCache.put(4000, "It's a Beautiful life");

        for (Map.Entry<Integer, String> entry : lruCache.entrySet()) {
            System.out.println(entry);
        }

    }
}
