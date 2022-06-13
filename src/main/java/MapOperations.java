import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapOperations {
    public static void main(String[] args) {
        // Tipo de contenedor de elementos que almacena elementos por clave y valor
        // No se permiten parametros primitivos
        // El primero parametro es la clave y el segundo el valor

        Map<Integer, String> actorMap = new HashMap<>();
        // HashMap no implementa las interfaces de collection o iterable
        System.out.println(actorMap instanceof Collection);
        System.out.println(actorMap instanceof Iterable);

        // Se utiliza put para insertar elementos al contenedor
        actorMap.put(1001, "Tom Hanks");
        actorMap.put(1002, "Will Smith");
        actorMap.put(1003, "Bruce Willis");
        actorMap.put(1004, "Chris Evans");
        actorMap.put(1005, "Brad Pitt");

        // Se pueden utilizar lo metodos size y isEmpty para conocer sobre los elementos del map
        System.out.println("Empty: " + actorMap.isEmpty());
        System.out.println("Size: " + actorMap.size());
        System.out.println("Elements: " + actorMap);

        // Se pueden obtener los elementos atravez de la key con el metodo get
        System.out.println(actorMap.get(1001));
        // Devuelve null si el objeto no existe
        System.out.println(actorMap.get(1008));
        // Eliminar un elemento
        actorMap.remove(1001);
        System.out.println(actorMap);

        // Para iterar sobre los elementos de un hashmap, se puede hacer de la siguiente forma
        Set<Map.Entry<Integer, String>> entrySet = actorMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        for (Map.Entry<Integer, String> entry : entrySet) {
            if (entry.getKey() == 1003) {
                // Podemos actualizar un valor y eso se vera reflejado en map
                entry.setValue("Bruce Willis 2");
            }
        }

        System.out.println(actorMap);

        // Tambien se puede iterar sobre los elementos del map, obteniendo un Set con todas las claves
        // y consultando clave por clave
        Set<Integer> keySet = actorMap.keySet();
        System.out.println("Set view of keys: " + keySet);

        for (Integer key : keySet) {
            System.out.println("Key: " + key + " Value: " + actorMap.get(key));
        }

        // Se puede obtener una colleccion con todos los valores del hashmap
        Collection<String> listActor = actorMap.values();


    }
}
