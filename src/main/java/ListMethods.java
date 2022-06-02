import java.util.ArrayList;

public class ListMethods {

    public static void main(String[] args) {
        // Los metodo que se utilizan a continuacion pertenecen todos a la interfaz list
        ArrayList<String> latamCities = new ArrayList<>();

        // Una caracteristica de las listas es que cada elemento tiene asignado un indice.
        // Agregar un elemento a un indice especifico.

        latamCities.add(0, "Cordoba");
        latamCities.add(1, "Asuncion");
        latamCities.add(2, "Santiago de Chile");
        // No elimina el elemento del indice 2, lo desplaza al final de la lista.
        latamCities.add(2, "Montevideo");
        latamCities.add(3, "Lima");
        latamCities.add(4, "La Paz");
        System.out.println(latamCities);

        // Obtener un elemento de un indice especifico
        System.out.println(latamCities.get(3));

        // Eliminar un elemento de la lista (retorna el elemento elimnado)
        System.out.println(latamCities.remove(5));

        // Se puede obtener el indece de un elemento
        System.out.println(latamCities.indexOf("Cordoba"));

        // indexOf devuelve el primer elemento que coincida con la busqueda
        latamCities.add(5, "Cordoba");
        System.out.println(latamCities.indexOf("Cordoba"));
        System.out.println(latamCities);

        // Obtener el indice de la primer coincidencia buscando de atras para adelante
        System.out.println(latamCities.lastIndexOf("Cordoba"));

        // Si no se encuentran resultado el indice devuelto sera -1
        System.out.println(latamCities.indexOf("Brazilia"));



    }
}
